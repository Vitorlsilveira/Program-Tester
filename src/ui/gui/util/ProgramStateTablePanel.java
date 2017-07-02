/*
 * The MIT License
 *
 * Copyright 2017 Neel Patel.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package ui.gui.util;

import ui.gui.util.table.ProgramStateCell;
import ui.gui.util.table.ProgramStateTableModel;
import java.util.List;
import java.util.function.Consumer;
import javax.swing.DefaultListCellRenderer;
import lib.run.test.util.IntProgramState;

/**
 *
 * @author Neel Patel
 */
public class ProgramStateTablePanel extends javax.swing.JPanel {

    ProgramStateCell pdc;
    ProgramStateTableModel pdtm;

    public ProgramStateCell getPdc() {
        return pdc;
    }

    public void setPdc(Consumer<IntProgramState> cons) {
        this.pdc = new ProgramStateCell(cons);
        jTable.setDefaultRenderer(Object.class, pdc);
        jTable.setDefaultEditor(Object.class, pdc);
        //((DefaultListCellRenderer)jTable.getDefaultRenderer(Object.class)).setOpaque(false);
        jTable.setColumnSelectionAllowed(true);
        jTable.setCellSelectionEnabled(true);
        jTable.setEnabled(true);
        jTable.setCellEditor(pdc);
    }

    public ProgramStateTableModel getPdtm() {
        return pdtm;
    }

    public void setPdtm(List<? extends IntProgramState>li) {
        this.pdtm = new ProgramStateTableModel(li);
        jTable.setModel(pdtm);
    }
    
    public ProgramStateTablePanel(){
        initComponents();
    }
    
    /**
     * Creates new form ProgramDetailTablePanel
     */
    public ProgramStateTablePanel(List<IntProgramState>li,Consumer<IntProgramState> cons) {
        pdc = new ProgramStateCell(cons);
        pdtm = new ProgramStateTableModel(li);
        initComponents();
        jTable.setAutoCreateColumnsFromModel(true);
        jTable.setModel(pdtm);
        jTable.setDefaultRenderer(Object.class, pdc);
        jTable.setDefaultEditor(Object.class, pdc);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.getViewport().setOpaque(false);
        jTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setOpaque(false);

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setOpaque(false);

        jTable.setBackground(new java.awt.Color(0, 0, 0));
        jTable.setForeground(new java.awt.Color(0, 0, 0));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ));
        jTable.setGridColor(new java.awt.Color(0, 0, 0));
        jTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable.setName(""); // NOI18N
        jTable.setOpaque(false);
        jTable.setRowHeight(60);
        jTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable.setTableHeader(null);
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}