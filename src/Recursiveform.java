import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Recursiveform extends javax.swing.JFrame {

    DefaultListModel model;
    int nums[] = new int[100000];
   
   
    public Recursiveform() {
        initComponents();
        model= new DefaultListModel();
        lstnums.setModel(model);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btngenerate = new javax.swing.JButton();
        btnbubble = new javax.swing.JButton();
        btnselc = new javax.swing.JButton();
        btninsert = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstnums = new javax.swing.JList();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btngenerate.setText("Generate Numbers");
        btngenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerateActionPerformed(evt);
            }
        });

        btnbubble.setText("Bubble");
        btnbubble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbubbleActionPerformed(evt);
            }
        });

        btnselc.setText("Selection");
        btnselc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselcActionPerformed(evt);
            }
        });

        btninsert.setText("Insertion");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(lstnums);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btngenerate)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnselc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btninsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnbubble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btngenerate)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(btnbubble)
                        .addGap(72, 72, 72)
                        .addComponent(btnselc)
                        .addGap(81, 81, 81)
                        .addComponent(btninsert)
                        .addGap(126, 126, 126))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane3)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbubbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbubbleActionPerformed
        model.clear();
        long stime = System.currentTimeMillis();
        bubbleSort(nums);
        long etime = (System.currentTimeMillis() - stime)/1000;
        JOptionPane.showMessageDialog(this, "Time it took: " + etime +" seconds.");
        //rebuild list
        for (int x = 0;x < nums.length;x ++){
            model.addElement(nums[x]);
        }
    }//GEN-LAST:event_btnbubbleActionPerformed

    private void btngenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerateActionPerformed
         model.clear();
            for(int x = 0;x < nums.length;x ++){
            nums[x]=(int)(Math.random()*100000) + 1;
            model.addElement(nums[x]);}
    }//GEN-LAST:event_btngenerateActionPerformed

    private void btnselcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselcActionPerformed
         model.clear();
        long stime = System.currentTimeMillis();
        selectionSort(nums);
        long etime = (System.currentTimeMillis() - stime)/1000;
        JOptionPane.showMessageDialog(this, "Time it took: " + etime + " seconds.");
        //rebuild list
        for (int x = 0;x < nums.length;x ++){
            model.addElement(nums[x]);
        }
    }//GEN-LAST:event_btnselcActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
         model.clear();
        long stime = System.currentTimeMillis();
        insertionSort(nums);
        long etime = (System.currentTimeMillis() - stime)/1000;
        JOptionPane.showMessageDialog(this, "Time it took: " + etime + " seconds.");
        //rebuild list
        for (int x = 0;x < nums.length;x ++){
            model.addElement(nums[x]);
    }//GEN-LAST:event_btninsertActionPerformed
    }
    
public static void selectionSort(int[] a){
   for (int i = 0; i < a.length - 1; i++){
      int minIndex = findMinimum(a, i);
      if (minIndex != i)
	
         swap(a, i, minIndex);
   } 
} 

public static int findMinimum(int[] a, int first){
 
   int minIndex = first; 
   for (int i = first + 1; i < a.length; i++)
      if (a[i] < a[minIndex])
         minIndex = i;
   return minIndex;
}
    
public static void insertionSort(int a[]){
	int itemToInsert, j;
	boolean stillLooking;
        
        for (int k=1; k<a.length; k++){
	
		itemToInsert = a[k];
		j=k-1;
		stillLooking=true;
		while(j >=0 && stillLooking){
			if (itemToInsert < a[j]){
				
				a[j+1] = a[j];
				j--;
			}
                        else{
				
				stillLooking=false;
			}
			a[j+1]=itemToInsert;
		}
  	}
}

 public static void bubbleSort(int[] a){
   	int k = 0;
   	boolean exchangeMade = true;
	
  
 	while ((k < a.length - 1) && exchangeMade){
      		exchangeMade = false;
      		k++;
      		for (int j = 0; j < a.length - k; j++)  
         		if (a[j] > a[j + 1]){
            			swap(a, j, j + 1);		 
            			exchangeMade = true;
         		}
		}
	
}
 
 public static void swap(int[] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
 
 public void quickSort(int[]a, int left, int right){
     if(left>= right)return;
     int i= left;
     int j= right;
     int pivotValue=a[(left + right)/2];
     while(i>j){
         while(a[i] < pivotValue)i++;
         while(pivotValue<a[j])j--;
         if(i<=j){
             int temp= a[i];
             a[i]=a[j];
             a[j]=temp;
             i++;
             j--;
         }
     }
     quickSort(a, left, j);
     quickSort(a, i, right);
 }
    
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
            java.util.logging.Logger.getLogger(Recursiveform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recursiveform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recursiveform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recursiveform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recursiveform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbubble;
    private javax.swing.JButton btngenerate;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnselc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList lstnums;
    // End of variables declaration//GEN-END:variables
}
