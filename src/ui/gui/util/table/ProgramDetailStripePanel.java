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
package ui.gui.util.table;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Neel Patel
 */
public class ProgramDetailStripePanel extends javax.swing.JPanel{

    /**
     * Creates new form ProgramDetailStripePanel
     */
    public ProgramDetailStripePanel() {
        initComponents();
    }

    public JLabel getCreditLabel() {
        return creditLabel;
    }

    public JButton getExpButton() {
        return expButton;
    }

    public JLabel getIndexLabel() {
        return indexLabel;
    }

    public JLabel getTitleLabel() {
        return titleLabel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        indexLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        creditLabel = new javax.swing.JLabel();
        expButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(600, 60));

        indexLabel.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        indexLabel.setForeground(new java.awt.Color(255, 255, 0));
        indexLabel.setText("12");

        titleLabel.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(112, 255, 124));
        titleLabel.setText("dsvdvsvsvdvs");

        creditLabel.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        creditLabel.setForeground(new java.awt.Color(0, 239, 195));
        creditLabel.setText("12");

        expButton.setBackground(new java.awt.Color(0, 0, 0));
        expButton.setForeground(new java.awt.Color(0, 0, 0));
        expButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/gui/util/source/More Than_48px.png"))); // NOI18N
        expButton.setBorder(null);
        expButton.setFocusPainted(false);
        expButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(indexLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(creditLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(expButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(indexLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(creditLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(expButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void expButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel creditLabel;
    private javax.swing.JButton expButton;
    private javax.swing.JLabel indexLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
