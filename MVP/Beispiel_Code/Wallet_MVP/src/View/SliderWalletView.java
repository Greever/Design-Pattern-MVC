/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.event.ChangeListener;

/**
 *
 * @author olf
 */
public class SliderWalletView extends javax.swing.JFrame implements IWalletView {

    /**
     * Creates new form SliderWalletView
     */
    public SliderWalletView() {
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

        currentValue_TextField = new javax.swing.JTextField();
        setValue_Slider = new javax.swing.JSlider();
        setValue_Label = new javax.swing.JLabel();
        currentValue_Label = new javax.swing.JLabel();
        header_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Slider");
        setResizable(false);

        currentValue_TextField.setEditable(false);
        currentValue_TextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        currentValue_TextField.setText("0.0 €");
        currentValue_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentValue_TextFieldActionPerformed(evt);
            }
        });

        setValue_Label.setText("set value:");

        currentValue_Label.setText("current value:");

        header_Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        header_Label.setText("Wallet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(currentValue_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(currentValue_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(setValue_Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(setValue_Label))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(header_Label)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header_Label)
                .addGap(4, 4, 4)
                .addComponent(setValue_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setValue_Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentValue_Label)
                    .addComponent(currentValue_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void currentValue_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentValue_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentValue_TextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentValue_Label;
    private javax.swing.JTextField currentValue_TextField;
    private javax.swing.JLabel header_Label;
    private javax.swing.JLabel setValue_Label;
    private javax.swing.JSlider setValue_Slider;
    // End of variables declaration//GEN-END:variables

    /*
     *@brief set Listener for changes in Model
     */
    @Override
    public void setMoneyListener(ChangeListener e_ref) {
       this.setValue_Slider.addChangeListener(e_ref);
    }

    @Override
    public int getMoneyFromView() {
        return this.setValue_Slider.getValue();
    }

    @Override
    public void setMoneyToView(double inputMoney) {
        this.currentValue_TextField.setText(Double.toString(inputMoney) + " €");
        this.setValue_Slider.setValue((int) inputMoney);
    }

}
