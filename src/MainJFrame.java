
import domain.UserSession;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jun
 */
public class MainJFrame extends javax.swing.JFrame {
    CaptCha cap = new CaptCha(); // 캡챠 기능 수행 
    
    DB_MAN DBM = new DB_MAN();

    
    
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        cap.generateCaptcha(lblImg); // 캡챠 이미지 만들어 넣음  
        btnLogin.setEnabled(false);  // 로그인버튼 캡챠 인증 전에는 안 열리게 구현
//     
        // db 조회 메서드. 일단 중지
        try {
            DBM.dbOpen();
//            getDBData(strSQL);
            DBM.dbClose();
        } catch (Exception e) {
            System.err.println("SQLException : " + e.getMessage());
        }
        
    }
    
    
    

// 여기에 추가적인 버튼이나 액션으로 캡차를 새로고침하는 이벤트를 추가 가능

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jOptionPane1 = new javax.swing.JOptionPane();
        lblInput = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblBirth = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtBirth = new javax.swing.JTextField();
        lblImg = new javax.swing.JLabel();
        lblcap = new javax.swing.JLabel();
        btnRe = new javax.swing.JButton();
        btnAuth = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtauth = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblInput.setText("회원 정보 입력");

        lblName.setText("이름 :");

        lblBirth.setText("생년월일 :");

        txtBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirthActionPerformed(evt);
            }
        });

        lblImg.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblcap.setText("자동 등록 방지를 위해 이미지에 나타난 문자를 입력하세요.");

        btnRe.setText("새로고침");
        btnRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReActionPerformed(evt);
            }
        });

        btnAuth.setText("인증");
        btnAuth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuthActionPerformed(evt);
            }
        });

        jLabel6.setText("(8자로 입력)");

        btnLogin.setText("로그인");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lblcap))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblInput, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblBirth)
                                    .addComponent(lblName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName)
                                    .addComponent(txtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtauth, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                            .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAuth, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRe)))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLogin)
                        .addGap(174, 174, 174))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBirth)
                    .addComponent(txtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRe)
                    .addComponent(btnAuth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtauth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBirthActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtBirthActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String nameValue = txtName.getText();
        String birthValue = txtBirth.getText();
        
        int userId = DBM.findUserId(nameValue, birthValue);
        if (userId != -1) {
            if (nameValue.equals("root")) {
                UserManagerJFrame userManagerJFrame = new UserManagerJFrame();
                userManagerJFrame.setVisible(true);
                this.dispose();
            }
            else {
                 UserSession.setUser(userId, nameValue, birthValue); // 세션 관리
            
            
                // HomeJFrame 열기
                JOptionPane.showMessageDialog(null, "로그인 성공!.");
                HomeJFrame homeFrame = null;
                try {
                    homeFrame = new HomeJFrame();
                } catch (IOException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                homeFrame.setVisible(true);

                // 현재 프레임 닫기
                this.dispose();
            }

        } else {
            JOptionPane.showMessageDialog(null, "로그인 실패.");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReActionPerformed
        // TODO add your handling code here:
        cap.generateCaptcha(lblImg);
        btnLogin.setEnabled(false);
    }//GEN-LAST:event_btnReActionPerformed

    private void btnAuthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuthActionPerformed
        // TODO add your handling code here:
       // 인증 버튼 클릭 이벤트
        String userInput = txtauth.getText();
        if (userInput.equals(cap.getCurrentCaptchaText())) {
            JOptionPane.showMessageDialog(this, "인증성공!");
            btnLogin.setEnabled(true);

        } else {
            JOptionPane.showMessageDialog(this, "인증실패!");
        }
    }//GEN-LAST:event_btnAuthActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAuth;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JLabel lblBirth;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblInput;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblcap;
    private javax.swing.JTextField txtBirth;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtauth;
    // End of variables declaration//GEN-END:variables


}
