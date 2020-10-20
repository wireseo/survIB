/*     */ package gui;
/*     */ 
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.ObjectInputStream;
/*     */ import java.io.ObjectOutputStream;
/*     */ import java.net.URL;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.border.EmptyBorder;
/*     */ import non_gui.Player;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Main
/*     */   extends JFrame
/*     */ {
/*     */   private JPanel contentPane;
/*     */   static Player p;
/*     */   
/*     */   public static void main(String[] args) {
/*  33 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/*     */             try {
/*  36 */               Main frame = new Main();
/*  37 */               frame.setVisible(true);
/*  38 */             } catch (Exception e) {
/*  39 */               e.printStackTrace();
/*     */             } 
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Main() {
/*  50 */     setDefaultCloseOperation(3);
/*  51 */     setBounds(80, 80, 1050, 600);
/*  52 */     this.contentPane = new JPanel();
/*  53 */     this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
/*  54 */     setContentPane(this.contentPane);
/*  55 */     this.contentPane.setLayout((LayoutManager)null);
/*     */     
/*  57 */     JButton btnStart = new JButton("NEW GAME");
/*  58 */     btnStart.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*  60 */             Main.this.dispose();
/*  61 */             Character_Creation cc = new Character_Creation();
/*  62 */             cc.setVisible(true);
/*     */           }
/*     */         });
/*  65 */     btnStart.setBounds(410, 350, 240, 45);
/*  66 */     this.contentPane.add(btnStart);
/*     */     
/*  68 */     JButton btnLoad = new JButton("LOAD");
/*  69 */     btnLoad.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*  71 */             Main.readPlayerFromFile();
/*     */             
/*  73 */             if (Main.readPlayerFromFile() != null) {
/*  74 */               Main.this.dispose();
/*  75 */               Home h = new Home();
/*  76 */               h.setVisible(true);
/*     */             } 
/*     */           }
/*     */         });
/*  80 */     btnLoad.setBounds(410, 400, 240, 45);
/*  81 */     this.contentPane.add(btnLoad);
/*     */     
/*  83 */     JButton btnHelpInfo = new JButton("HELP / INFO");
/*  84 */     btnHelpInfo.setBounds(410, 450, 240, 45);
/*  85 */     this.contentPane.add(btnHelpInfo);
/*  86 */     btnHelpInfo.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*  88 */             Main.infoBox("This game is based on an existing diploma programme named the 'International Baccalaureate' (IB or IBDP for short). If you are interested in learning more about the IBDP, \nplease go to the official IB website for guidance. This game will require prior knowledge of the IBDP.\n\nIn order to play this game, you need to know how to manage the short amount of given time well. The goal is to 'survive' till week 90 - 92, when the IB final exams are held.\nYou can fail the IB in a variety of ways, each of which you will have to avoid through your smart choices of how to spend your time in-game. The failing criteria are copied\nfrom the IB failing criteria as of 2018. Some hidden variables may influence your ending as well.\n\nAll elements of the game have been modeled after real-life experiences of IB alumni/current IB students, but this does not mean that every decision you make in the game \ncan be applied to real life. Please be aware of this. \n\nYour save file is a dat file called p.dat; please do not delete this file unless you want to reset your progress.\n\n>> NOTE: THIS GAME IS IN BETA TESTING STAGE. <<", 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*  93 */                 "H E L P / I N F O");
/*     */           }
/*     */         });
/*     */     
/*  97 */     JButton btnCredits = new JButton("CREDITS");
/*  98 */     btnCredits.setBounds(410, 500, 240, 45);
/*  99 */     this.contentPane.add(btnCredits);
/* 100 */     btnCredits.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 102 */             Main.infoBox("\n\nGame design by YSEO / Written by YSEO / Programming by YSEO / Art by ChaeHyun / Character Design by JungMi Moon / Creative producers: YSEO and ChaeHyun\n\nContributers: angelayin22449 / 19lexi.lu / Saeedeh.shafaeeahmad / advitsoni / marcuscheung0316 / Lotteliseevensen / vfethke / anilorakkaro / daisyblijdorp\n\n", "C R E D I T S");
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 107 */     JLabel lblVer = new JLabel("ver 0.1.1");
/* 108 */     lblVer.setHorizontalAlignment(11);
/* 109 */     lblVer.setBounds(873, 556, 171, 16);
/* 110 */     this.contentPane.add(lblVer);
/*     */     
/* 112 */     URL url = Main.class.getResource("/main.jpg");
/* 113 */     JLabel lblBg = new JLabel("");
/* 114 */     lblBg.setHorizontalAlignment(0);
/* 115 */     lblBg.setBounds(0, -5, 1050, 600);
/* 116 */     this.contentPane.add(lblBg);
/* 117 */     lblBg.setIcon(new ImageIcon(url));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void infoBox(String infoMessage, String titleBar) {
/* 123 */     JOptionPane.showMessageDialog(null, infoMessage, titleBar, 1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static Player readPlayerFromFile() {
/*     */     
/* 130 */     try { ObjectInputStream in = new ObjectInputStream(new FileInputStream("p.dat"));
/* 131 */       p = (Player)in.readObject();
/* 132 */       in.close(); }
/* 133 */     catch (IOException e) { e.printStackTrace(); return null; }
/* 134 */     catch (ClassNotFoundException e1) { return null; }
/* 135 */      return p;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void savePlayerToFile() {
/*     */     
/* 142 */     try { ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("p.dat"));
/* 143 */       out.writeObject(p);
/* 144 */       out.close(); }
/* 145 */     catch (IOException e) { e.printStackTrace(); }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\82109\Downloads\survIB (v0.1.1).jar!\gui\Main.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */