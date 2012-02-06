package org.decibeltechnology.decibel.ui.customizer;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import org.netbeans.modules.php.api.util.UiUtils;
import org.decibeltechnology.decibel.DecibelToolkit;
import org.openide.awt.Mnemonics;
import org.openide.util.NbBundle;

public class DecibelCustomizerPanel extends JPanel {
    private static final long serialVersionUID = 173459120857644L;

    public DecibelCustomizerPanel() {
        initComponents();
    }

    public boolean isIgnoreCacheDirectory() {
        return ignoreCacheDirectoryCheckBox.isSelected();
    }

    public void setIgnoreCacheDirectory(boolean ignore) {
        ignoreCacheDirectoryCheckBox.setSelected(ignore);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ignoreCacheDirectoryCheckBox = new JCheckBox();
        infoLabel = new JLabel();
        optionsLabel = new JLabel();
		Mnemonics.setLocalizedText(ignoreCacheDirectoryCheckBox, NbBundle.getMessage(DecibelCustomizerPanel.class, "DecibelCustomizerPanel.ignoreCacheDirectoryCheckBox.text")); // NOI18N
		Mnemonics.setLocalizedText(infoLabel, NbBundle.getMessage(DecibelCustomizerPanel.class, "DecibelCustomizerPanel.infoLabel.text")); // NOI18N
		Mnemonics.setLocalizedText(optionsLabel, NbBundle.getMessage(DecibelCustomizerPanel.class, "DecibelCustomizerPanel.optionsLabel.text")); // NOI18N
        optionsLabel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                optionsLabelMouseEntered(evt);
            }
            public void mousePressed(MouseEvent evt) {
                optionsLabelMousePressed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addComponent(ignoreCacheDirectoryCheckBox)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(infoLabel)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(optionsLabel)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ignoreCacheDirectoryCheckBox)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(infoLabel)
                    .addComponent(optionsLabel))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void optionsLabelMouseEntered(MouseEvent evt) {//GEN-FIRST:event_optionsLabelMouseEntered
        evt.getComponent().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_optionsLabelMouseEntered

    private void optionsLabelMousePressed(MouseEvent evt) {//GEN-FIRST:event_optionsLabelMousePressed
        UiUtils.showOptions(DecibelToolkit.OPTIONS_SUB_PATH);
    }//GEN-LAST:event_optionsLabelMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JCheckBox ignoreCacheDirectoryCheckBox;
    private JLabel infoLabel;
    private JLabel optionsLabel;
    // End of variables declaration//GEN-END:variables

}