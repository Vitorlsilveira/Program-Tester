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
package modul;

import javax.swing.JFrame;
import modul.admin.IntProgramDBFlow;
import modul.admin.IntUserDBFlow;
import modul.admin.ProgramDBFlow;
import modul.admin.UserDBFlow;
import programTester.config.Configurator;
import ui.IntUI;
import ui.gui.admin.AdminPanel;
import ui.gui.admin.ProgramDBUI;
import ui.gui.admin.UserDBUI;

/**
 *
 * @author Neel Patel
 */
public class ProgramDBAdminTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Configurator.init();
        JFrame jf=new JFrame();
        AdminPanel ap=new AdminPanel();
        IntProgramDBFlow pdf=new ProgramDBFlow();
        IntUI ui=new ProgramDBUI(pdf, ap);
        IntUserDBFlow uf=new UserDBFlow();
        IntUI ui2=new UserDBUI(uf, ap);
        jf.add(ap);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(2);
    }
    
}
