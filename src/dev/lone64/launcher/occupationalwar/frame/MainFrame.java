/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dev.lone64.launcher.occupationalwar.frame;

import dev.lone64.launcher.occupationalwar.Main;
import dev.lone64.launcher.occupationalwar.auth.MCAuth;
import dev.lone64.launcher.occupationalwar.client.ClientLoader;
import dev.lone64.launcher.occupationalwar.data.MinecraftClient;
import dev.lone64.launcher.occupationalwar.data.MinecraftAccount;
import dev.lone64.launcher.occupationalwar.json.JsonLauncher;
import dev.lone64.launcher.occupationalwar.util.FileUtil;
import dev.lone64.launcher.occupationalwar.util.HttpUtil;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Point;
import java.io.IOException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author lone64dev
 */
public final class MainFrame extends JFrame {
    
    public static MainFrame INSTANCE;
    
    private Point mouseDownCompCoords;
    
    private final MinecraftClient client;
    private final MinecraftAccount account;

    /**
     * Creates new form ProfileFrame
     * @param account
     */
    public MainFrame(MinecraftAccount account) {
        INSTANCE = this;
        
        this.mouseDownCompCoords = null;
        
        this.account = account;
        this.client = JsonLauncher.getInstance().getSelectedClient();
        
        /* Create a 'Minecraft' folder */
        MCAuth.getInstance().createMinecraftDir();
        
        setIconImage();
        initComponents();
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 155));
        
        setProgressPanelVisible(false);
        getProgressBar().setStringPainted(true);
        getProgressBar().setString("%s/%s".formatted("0", "100"));
        
        this.nameText.setText(account.getUserName());
        this.headIcon.setIcon(HttpUtil.createImage(account.getHeadUrl()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeIcon = new javax.swing.JLabel();
        minimizeIcon = new javax.swing.JLabel();
        windowPanel = new javax.swing.JPanel();
        launcherTitle = new javax.swing.JLabel();
        userPanel = new javax.swing.JPanel();
        nameText = new javax.swing.JLabel();
        headIcon = new javax.swing.JLabel();
        logoutButton = new javax.swing.JLabel();
        folderButton = new javax.swing.JLabel();
        playButton = new javax.swing.JLabel();
        progressPanel = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("점령전 런처 | 메인");
        setName("MainFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        closeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/close-16.png"))); // NOI18N
        closeIcon.setLabelFor(this);
        closeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeIconMouseClicked(evt);
            }
        });

        minimizeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/minimize-16.png"))); // NOI18N
        minimizeIcon.setLabelFor(this);
        minimizeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeIconMouseClicked(evt);
            }
        });

        windowPanel.setBackground(new Color(0, 0, 0, 0));
        windowPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                windowPanelMouseDragged(evt);
            }
        });
        windowPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                windowPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                windowPanelMouseReleased(evt);
            }
        });

        launcherTitle.setFont(launcherTitle.getFont().deriveFont(launcherTitle.getFont().getStyle() | java.awt.Font.BOLD, 12));
        launcherTitle.setForeground(new java.awt.Color(255, 255, 255));
        launcherTitle.setText("마인크래프트 점령전 런처");

        javax.swing.GroupLayout windowPanelLayout = new javax.swing.GroupLayout(windowPanel);
        windowPanel.setLayout(windowPanelLayout);
        windowPanelLayout.setHorizontalGroup(
            windowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(windowPanelLayout.createSequentialGroup()
                .addComponent(launcherTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        windowPanelLayout.setVerticalGroup(
            windowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(windowPanelLayout.createSequentialGroup()
                .addComponent(launcherTitle)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        userPanel.setBackground(new Color(0, 0, 0, 100));

        nameText.setFont(nameText.getFont().deriveFont(nameText.getFont().getStyle() | java.awt.Font.BOLD, 13));
        nameText.setForeground(new java.awt.Color(255, 255, 255));
        nameText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/human-16.png"))); // NOI18N
        nameText.setLabelFor(userPanel);
        nameText.setText("마인크래프트 닉네임");

        headIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headIcon.setLabelFor(userPanel);

        logoutButton.setFont(logoutButton.getFont().deriveFont(logoutButton.getFont().getStyle() | java.awt.Font.BOLD, 12));
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/logout-16.png"))); // NOI18N
        logoutButton.setLabelFor(userPanel);
        logoutButton.setText("로그아웃");
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        folderButton.setFont(folderButton.getFont().deriveFont(folderButton.getFont().getStyle() | java.awt.Font.BOLD, 12));
        folderButton.setForeground(new java.awt.Color(255, 255, 255));
        folderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/folder-16.png"))); // NOI18N
        folderButton.setLabelFor(userPanel);
        folderButton.setText("게임 폴더");
        folderButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        folderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                folderButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addComponent(headIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addComponent(logoutButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(folderButton)
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addComponent(nameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addComponent(nameText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(folderButton))
                        .addGap(12, 12, 12))
                    .addComponent(headIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        playButton.setFont(playButton.getFont().deriveFont(playButton.getFont().getStyle() | java.awt.Font.BOLD, 12));
        playButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button/game_start_button.png"))); // NOI18N
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playButtonMouseClicked(evt);
            }
        });

        progressPanel.setBackground(new Color(0, 0, 0, 0));

        progressBar.setBackground(new java.awt.Color(255, 255, 255));
        progressBar.setFont(progressBar.getFont().deriveFont(progressBar.getFont().getStyle() | java.awt.Font.BOLD, 10));
        progressBar.setForeground(new java.awt.Color(204, 0, 204));
        progressBar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));

        javax.swing.GroupLayout progressPanelLayout = new javax.swing.GroupLayout(progressPanel);
        progressPanel.setLayout(progressPanelLayout);
        progressPanelLayout.setHorizontalGroup(
            progressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(progressBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        progressPanelLayout.setVerticalGroup(
            progressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(progressPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(playButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(windowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minimizeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(windowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimizeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(progressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeIconMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeIconMouseClicked

    private void minimizeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeIconMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeIconMouseClicked

    /* Window Controller */
    private void windowPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowPanelMouseDragged
        var currCoords = evt.getLocationOnScreen();
        setLocation(currCoords.x - this.mouseDownCompCoords.x, currCoords.y - this.mouseDownCompCoords.y);
    }//GEN-LAST:event_windowPanelMouseDragged

    private void windowPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowPanelMousePressed
        this.mouseDownCompCoords = evt.getPoint();
    }//GEN-LAST:event_windowPanelMousePressed

    private void windowPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowPanelMouseReleased
        this.mouseDownCompCoords = null;
    }//GEN-LAST:event_windowPanelMouseReleased
    /* Window Controller */
    
    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        var file = FileUtil.getDataFolder("playerdata.json");
        if (!file.exists()) {
            System.out.print("[%s] An error occurred during Microsoft logout.\n".formatted(Main.LAUNCHER_NAME));
            JOptionPane.showMessageDialog(this, "마이크로소프트 로그아웃 도중 오류가 발생했습니다.", Main.LAUNCHER_NAME, JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        setVisible(false);
        FileUtil.deleteFile(file);
        EventQueue.invokeLater(() -> MSAuthFrame.visible());
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void playButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseClicked
        if (this.client == null) {
            System.out.print("[%s] Unable to load Minecraft client information.\n".formatted(Main.LAUNCHER_NAME));
            JOptionPane.showMessageDialog(this, "마인크래프트 클라이언트 정보를 불러올 수 없습니다.", Main.LAUNCHER_NAME, JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        this.playButton.setEnabled(false);
        new ClientLoader(this.client, this.account).playClient();
    }//GEN-LAST:event_playButtonMouseClicked

    private void folderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_folderButtonMouseClicked
        try {
            Desktop.getDesktop().open(FileUtil.getDataFolder("Minecraft"));
        } catch (IOException e) {
            System.out.print("[%s] The game folder could not be found, or there was an error opening it.\n".formatted(Main.LAUNCHER_NAME));
            JOptionPane.showMessageDialog(this, "게임 폴더를 찾을 수 없거나, 여는 도중 오류가 발생했습니다.", Main.LAUNCHER_NAME, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_folderButtonMouseClicked
    
    private void setIconImage() {
        URL imgURL = Main.class.getResource("/assets/icon/app_icon.png");
        ImageIcon icon = new ImageIcon(imgURL);
        setIconImage(icon.getImage());
    }
    
    public void setProgressPanelVisible(boolean visible) {
        this.progressPanel.setVisible(visible);
    }
    
    public JLabel getPlayButton() {
        return playButton;
    }
    
    public JProgressBar getProgressBar() {
        return progressBar;
    }
    
    public static void visible(MinecraftAccount account) {
        var frame = new MainFrame(account);
        frame.setVisible(true);
    }
    
    public static MainFrame getInstance() {
        return INSTANCE;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeIcon;
    private javax.swing.JLabel folderButton;
    private javax.swing.JLabel headIcon;
    private javax.swing.JLabel launcherTitle;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JLabel minimizeIcon;
    private javax.swing.JLabel nameText;
    private javax.swing.JLabel playButton;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JPanel progressPanel;
    private javax.swing.JPanel userPanel;
    private javax.swing.JPanel windowPanel;
    // End of variables declaration//GEN-END:variables
}
