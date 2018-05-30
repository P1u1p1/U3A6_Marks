/*
 * Seth James England
 * U3A6_Marks.java
 * this is a program used to sort grades and give you information as well
 */
// Here I am importing my decimecal format, and my java.util
package u3a6_marks;
import java.text.DecimalFormat;
import java.util.*;
/*
 * Seth James England
 */
public class U3A6_MarksFrame extends javax.swing.JFrame {
    // here i am declaring my arraylist to hold all of my grades, and my decimal format 
    ArrayList <Integer> allThemGrades = new ArrayList();
    DecimalFormat x = new DecimalFormat("#.##");

    public U3A6_MarksFrame() {
        initComponents();
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
        enterButton = new javax.swing.JButton();
        inputText = new javax.swing.JTextField();
        outputLabel = new javax.swing.JLabel();
        studentmarksLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sortedGradesTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaAnalyze = new javax.swing.JTextArea();
        sortButton = new javax.swing.JButton();
        analyzeButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        meauBar = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        inputText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTextActionPerformed(evt);
            }
        });

        outputLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        outputLabel.setText("Marks Program");

        studentmarksLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentmarksLabel.setText("Students Mark:");

        sortedGradesTextArea.setColumns(20);
        sortedGradesTextArea.setRows(5);
        jScrollPane1.setViewportView(sortedGradesTextArea);

        textAreaAnalyze.setColumns(20);
        textAreaAnalyze.setRows(5);
        jScrollPane2.setViewportView(textAreaAnalyze);

        sortButton.setText("Sort");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        analyzeButton.setText("Analyze");
        analyzeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(studentmarksLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputText, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(enterButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                        .addGap(28, 28, 28))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(sortButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(analyzeButton)
                .addGap(101, 101, 101))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(outputLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outputLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentmarksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortButton)
                    .addComponent(analyzeButton))
                .addContainerGap())
        );

        meauBar.setText("File");
        jMenuBar1.add(meauBar);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTextActionPerformed
    /*
    *this is my enter buttons code, it takes the value in the text box, and converts it to a string and places it in the text area so you can keep track of the grades you have already put in 
    */
    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        // declaring my grades
        int grades = Integer.parseInt(inputText.getText());
        // the if loop that decides if the grade is actually a grade, and is allowed to be added to the array list / text area for sorting later
         if (grades <= 100 && grades >= 0) {
        allThemGrades.add(Integer.parseInt(inputText.getText()));
        sortedGradesTextArea.append(inputText.getText());
        sortedGradesTextArea.append("\n");
    }
         
    }//GEN-LAST:event_enterButtonActionPerformed
    /*
    *the code for my sort button, which puts the grades in order from highest to lowest
    */
    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        // the call code to sort the grades
        Collections.sort(allThemGrades);
        // clearing the text for a reset after every sort
        sortedGradesTextArea.setText("");
        // the for loop that prints the grades in order
        for (int i = 0; i < allThemGrades.size(); i++) {
            sortedGradesTextArea.append(Integer.toString(allThemGrades.get(i)));
            sortedGradesTextArea.append("\n");
        }
    }//GEN-LAST:event_sortButtonActionPerformed
    /*
    *this is a method that determines the class average, and returns it 
    */
     public Double marks (Double averageMarks) {
         // declaring ints
        int addEmUp = 0;
        // the for loop that calculates the total marks added up
        for (int i = 0; i < allThemGrades.size(); i++){
        averageMarks += addEmUp + allThemGrades.get(i);
        System.out.println(averageMarks);
    }
        // the returned value, divided by the siz of the array to give you your class average
        return Double.parseDouble(x.format(averageMarks / allThemGrades.size()));
                }
     /*
     * this is the button code that takes all of the information and displays it in the right text area, such as range, max min, class average, and the numbers of how many students would recieve number grades
     */
    private void analyzeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeButtonActionPerformed
        // delcaring ints
        int bba = max(0) - min(0);
        int levelr = 0;
        int level1 = 0;
        int level2 = 0;
        int level3 = 0;
        int level4 = 0;
        // printing the main information, such as range, ma and min and class average
        Collections.sort(allThemGrades);
        textAreaAnalyze.setText("");
        textAreaAnalyze.append("Average Marks in the class:");
        textAreaAnalyze.append(Double.toString(marks(0.0)) + "%");
        textAreaAnalyze.append("\n");
        textAreaAnalyze.append("The Max: " + max(0));
        textAreaAnalyze.append("\n");
        textAreaAnalyze.append("The Min: " + min(0));
        textAreaAnalyze.append("\n");
        textAreaAnalyze.append("The Range: " + bba);
        // the for loop that sorts the childrens number grades ino level grades
        for (int i = 0; i < allThemGrades.size(); i++) {
            if (allThemGrades.get(i) <= 50) {
               levelr++;
            }
            else if (allThemGrades.get(i) >= 50 && allThemGrades.get(i) <60) {
               level1++;
            }
            else if (allThemGrades.get(i) >= 60 && allThemGrades.get(i) <70){
                level2++;
            }
             else if (allThemGrades.get(i) >= 70 && allThemGrades.get(i) <80){
                 level3++;
             }
             else if (allThemGrades.get(i) >= 80){
                 level4++;
             }
        }
        // the code that displays how many kids are in each level
        textAreaAnalyze.append("\n");
        textAreaAnalyze.append("Level R: " + Integer.toString(levelr));
        textAreaAnalyze.append("\n");
        textAreaAnalyze.append("Level 1: " + Integer.toString(level1));
        textAreaAnalyze.append("\n");
        textAreaAnalyze.append("Level 2: " + Integer.toString(level2));
        textAreaAnalyze.append("\n");
        textAreaAnalyze.append("Level 3: " + Integer.toString(level3));
        textAreaAnalyze.append("\n");
        textAreaAnalyze.append("Level 4: " + Integer.toString(level4));
    }//GEN-LAST:event_analyzeButtonActionPerformed
   /* 
    * the method for max
    */
    public int max (int theMax) {
        // the for loop for the max
        for (int i = 0; i < allThemGrades.size(); i++){
            theMax = allThemGrades.get(i);
        }
        // returning the max
        return theMax;
    }
    /*
    * the method for the min
    */
    public int min (int theMin) {
        // the min being declared
        theMin = allThemGrades.get(0);
        // returning the min
        return theMin;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(U3A6_MarksFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(U3A6_MarksFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(U3A6_MarksFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(U3A6_MarksFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new U3A6_MarksFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analyzeButton;
    private javax.swing.JButton enterButton;
    private javax.swing.JTextField inputText;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu meauBar;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JButton sortButton;
    private javax.swing.JTextArea sortedGradesTextArea;
    private javax.swing.JLabel studentmarksLabel;
    private javax.swing.JTextArea textAreaAnalyze;
    // End of variables declaration//GEN-END:variables
}
