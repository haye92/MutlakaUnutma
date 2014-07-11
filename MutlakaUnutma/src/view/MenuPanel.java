/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

/**
 *
 * @author haye
 */
public class MenuPanel extends javax.swing.JPanel {

    /**
     * Creates new form MenuPanel
     */
    public MenuPanel() {
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

        btnAlarmlar = new javax.swing.JButton();
        btnSiteler = new javax.swing.JButton();
        btnFilmler = new javax.swing.JButton();
        btnMuzikler = new javax.swing.JButton();
        btnDogumGunleri = new javax.swing.JButton();
        btnEkle = new javax.swing.JButton();

        btnAlarmlar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resimler/alarm_2.png"))); // NOI18N
        btnAlarmlar.setToolTipText("Saatli Hatırlatmalar");

        btnSiteler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resimler/site.png"))); // NOI18N
        btnSiteler.setToolTipText("Siteler");

        btnFilmler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resimler/film.png"))); // NOI18N
        btnFilmler.setToolTipText("Filmler");

        btnMuzikler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resimler/muzik.png"))); // NOI18N
        btnMuzikler.setToolTipText("Müzikler");

        btnDogumGunleri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resimler/dogumgunu.png"))); // NOI18N
        btnDogumGunleri.setToolTipText("Doğum Günleri");

        btnEkle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resimler/ekle.png"))); // NOI18N
        btnEkle.setToolTipText("Yeni Kategori Ekle");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAlarmlar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, Short.MAX_VALUE)
                        .addComponent(btnSiteler, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnFilmler, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(btnMuzikler, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDogumGunleri, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAlarmlar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSiteler, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFilmler, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMuzikler, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDogumGunleri, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAlarmlar;
    public javax.swing.JButton btnDogumGunleri;
    public javax.swing.JButton btnEkle;
    public javax.swing.JButton btnFilmler;
    public javax.swing.JButton btnMuzikler;
    public javax.swing.JButton btnSiteler;
    // End of variables declaration//GEN-END:variables
}