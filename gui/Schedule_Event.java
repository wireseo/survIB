/*      */ package gui;
/*      */ 
/*      */ import java.awt.Color;
/*      */ import java.awt.LayoutManager;
/*      */ import java.awt.event.ActionEvent;
/*      */ import java.awt.event.ActionListener;
/*      */ import java.net.URL;
/*      */ import java.util.Random;
/*      */ import javax.swing.BorderFactory;
/*      */ import javax.swing.ImageIcon;
/*      */ import javax.swing.JButton;
/*      */ import javax.swing.JFrame;
/*      */ import javax.swing.JLabel;
/*      */ import javax.swing.JOptionPane;
/*      */ import javax.swing.JPanel;
/*      */ import javax.swing.JScrollPane;
/*      */ import javax.swing.JTextArea;
/*      */ import javax.swing.border.Border;
/*      */ import javax.swing.border.EmptyBorder;
/*      */ 
/*      */ public class Schedule_Event
/*      */   extends JFrame
/*      */ {
/*      */   private JPanel contentPane;
/*      */   static boolean contin = false;
/*      */   static boolean home = false;
/*   27 */   JButton btnContinue = new JButton("C O N T I N U E");
/*   28 */   JButton btnHome = new JButton("H O M E");
/*   29 */   int i = 0;
/*   30 */   int j = 0;
/*      */   boolean ibFinals = false;
/*   32 */   String[] ibFinalText = new String[35];
/*   33 */   static String tokScore = "";
/*   34 */   static String eeScore = "";
/*   35 */   static String failReason = "";
/*   36 */   static int bonus = 0;
/*      */   
/*   38 */   static int g1_score = 0;
/*   39 */   static int g2_score = 0;
/*   40 */   static int g3_score = 0;
/*   41 */   static int g4_score = 0;
/*   42 */   static int g5_score = 0;
/*   43 */   static int g6_score = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Schedule_Event() {
/*   51 */     this.ibFinalText[0] = "This is it.";
/*   52 */     this.ibFinalText[1] = "Today is the day of your first IB exam.";
/*   53 */     this.ibFinalText[2] = "For the next two weeks or so, you're going to be very, very busy. But you know what?";
/*   54 */     this.ibFinalText[3] = "It's worth it. This is what makes the last two years worth it.";
/*   55 */     this.ibFinalText[4] = "You pack your bag and head to school.";
/*   56 */     this.ibFinalText[5] = "If you're not ready now, well...You wish yourself a lot of luck.";
/*   57 */     this.ibFinalText[6] = "But hopefully, you won't even need it.";
/*   58 */     this.ibFinalText[7] = ">> TWO WEEKS LATER";
/*   59 */     this.ibFinalText[8] = "Whew. That was your last IB exam.";
/*   60 */     this.ibFinalText[9] = "You can't believe it. It's finally over!";
/*   61 */     this.ibFinalText[10] = "The bittersweet moment has finally come, and you feel tears of joy streaming down your face as you hug your friends and scream as loud as you can.";
/*      */     
/*   63 */     this.ibFinalText[11] = "I mean, you're still at school, but who cares. It's over! It's over!";
/*   64 */     this.ibFinalText[12] = "You head home with your friends and watch epic movies together while binging on all different kinds of ice cream and all the other things that you kept for this moment.";
/*   65 */     this.ibFinalText[13] = "You just have to wait two months for the results. But you don't care about that now.";
/*   66 */     this.ibFinalText[14] = "Gotta watch that movie. You swallow the salty popcorn, cherishing every flavor of the stress-free moment.";
/*   67 */     this.ibFinalText[15] = ">> TWO MONTHS LATER";
/*   68 */     this.ibFinalText[16] = "You're sitting in front of the computer, anxiously biting your lips.";
/*   69 */     this.ibFinalText[17] = "It's almost time for the release of your final IB score.";
/*   70 */     this.ibFinalText[18] = "You enter your PIN and personal code that your school coordinator gave into the website.";
/*   71 */     this.ibFinalText[19] = "Nerve-wracking as it is, you can't wait to actually see how well you've done and to see the results of your two-years worth of hard work.";
/*   72 */     this.ibFinalText[20] = "You click the refresh button, biting your lips.";
/*   73 */     this.ibFinalText[21] = "You click again.";
/*   74 */     this.ibFinalText[22] = "And again.";
/*   75 */     this.ibFinalText[23] = "And again...";
/*   76 */     this.ibFinalText[24] = "And again...";
/*   77 */     this.ibFinalText[25] = "And again...";
/*   78 */     this.ibFinalText[26] = "And voila, the candidate results website churns out your results!";
/*   79 */     this.ibFinalText[27] = "And you got...\n\n";
/*      */ 
/*      */     
/*   82 */     setDefaultCloseOperation(3);
/*   83 */     setBounds(100, 100, 1050, 600);
/*   84 */     this.contentPane = new JPanel();
/*   85 */     this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
/*   86 */     setContentPane(this.contentPane);
/*   87 */     this.contentPane.setLayout((LayoutManager)null);
/*      */     
/*   89 */     final JTextArea textPane = new JTextArea();
/*   90 */     textPane.setEditable(false);
/*   91 */     textPane.setBounds(330, 32, 693, 466);
/*   92 */     this.contentPane.add(textPane);
/*   93 */     textPane.append("SCHEDULE SESSION " + Main.p.getWeek() + "\n\n");
/*   94 */     Border border = BorderFactory.createLineBorder(Color.BLACK);
/*   95 */     textPane.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(8, 8, 8, 8)));
/*   96 */     textPane.setLineWrap(true);
/*      */     
/*   98 */     JScrollPane scrollPane = new JScrollPane(textPane);
/*   99 */     scrollPane.setBounds(330, 32, 693, 466);
/*  100 */     this.contentPane.add(scrollPane);
/*      */     
/*  102 */     this.btnContinue.setBounds(363, 518, 275, 40);
/*  103 */     this.contentPane.add(this.btnContinue);
/*  104 */     this.btnContinue.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent e) {
/*  106 */             if (Schedule_Event.this.ibFinals) {
/*  107 */               textPane.append(String.valueOf(Schedule_Event.this.ibFinalText[Schedule_Event.this.j]) + "\n\n");
/*  108 */               if (Schedule_Event.this.j == 27) Schedule_Event.this.ibFinals(); 
/*  109 */               if (Schedule_Event.this.j == 34) Schedule_Event.this.displayResults(); 
/*  110 */               Schedule_Event.this.j++;
/*      */             } else {
/*      */               
/*  113 */               Schedule_Event.this.eventManager(textPane, Schedule_Event.this.i);
/*  114 */               Schedule_Event.this.i++;
/*      */             } 
/*      */           }
/*      */         });
/*      */     
/*  119 */     this.btnHome.setBounds(715, 518, 275, 40);
/*  120 */     this.contentPane.add(this.btnHome);
/*  121 */     this.btnHome.setEnabled(false);
/*  122 */     if (this.ibFinals) this.btnHome.setEnabled(false); 
/*  123 */     this.btnHome.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent e) {
/*  125 */             Schedule_Event.this.btnContinue.setEnabled(true);
/*  126 */             Main.p.setWeekSchedule(new int[4]);
/*  127 */             Schedule_Event.this.dispose();
/*  128 */             Home h = new Home();
/*  129 */             h.setVisible(true);
/*      */           }
/*      */         });
/*      */     
/*  133 */     specialEventManager(Main.p.getWeek());
/*      */   }
/*      */   
/*      */   public void specialEventManager(int week) {
/*      */     URL url;
/*  138 */     if (week == 1) {
/*  139 */       int dialogButton = JOptionPane.showConfirmDialog(null, "Your friend asks you for a copy of your IA. Will you give it to them?", "Huh?", 0);
/*      */       
/*  141 */       if (dialogButton == 0) {
/*  142 */         Main.infoBox("Your friend thanks you. You feel a bit iffy about the one-sided transaction.\nYour social increases by 10. Your stress increases by 10.", "Hmm...");
/*  143 */         Main.p.setStress(Main.p.getStress() + 10);
/*  144 */         Main.p.setSocial(Main.p.getSocial() + 10);
/*      */         
/*  146 */         Random rand = new Random();
/*  147 */         int n = rand.nextInt(10) + 1;
/*      */         
/*  149 */         if (n >= 4)
/*      */         {
/*      */ 
/*      */           
/*  153 */           Main.p.setMalpractice(true);
/*      */         
/*      */         }
/*      */       }
/*  157 */       else if (dialogButton == 1) {
/*  158 */         Main.infoBox("Your friend is mad at you, but you have a weird feeling that you just avoided a very dangerous path to failing the IB. Whew!", "Yaay!");
/*      */       }
/*      */     
/*  161 */     } else if (week == 2) {
/*  162 */       Main.infoBox("Your homeroom teacher announces the date for finals! You have approximately two months to prepare. Make sure you have at least some confidence in all subjects.", "OOH!");
/*      */     }
/*  164 */     else if (week == 3) {
/*  165 */       if (Main.p.isMalpractice()) {
/*  166 */         Main.infoBox("The IB coordinator calls you and your friend to their office. It seems like your friend completely copied your work!\nYou both promise to never go against academic integrity, ever again.\nThankfully, the IB coordinator forgave you two and gave your friend a second chance to start over.", "Oops!");
/*  167 */         Main.p.setMalpractice(false);
/*      */       } else {
/*      */         
/*  170 */         Main.infoBox("You see your friend who asked for a copy of your IA crying, begging the IB coordinator for another chance.\nYou feel bad for them, but also a bit of relief that you're not in their situation.", "WHEW!");
/*      */       }
/*      */     
/*  173 */     } else if (week == 4) {
/*  174 */       if (Main.p.getG4_score() > 20) {
/*  175 */         Main.infoBox("Your " + Main.p.getG4_subject()[1] + " teacher announces a pop quiz! Thankfully, you knew the material pretty well.\nYour Group 4 score increases by 30.", "YAAY!");
/*  176 */         Main.p.setG4_score(Main.p.getG4_score() + 30);
/*      */       } else {
/*      */         
/*  179 */         Main.infoBox("Your " + Main.p.getG4_subject()[1] + " teacher announces a pop quiz! Unfortunately, you can't remember the relevant material.\nYour Group 4 does not improve.", "Oops!");
/*      */       }
/*      */     
/*  182 */     } else if (week != 5) {
/*      */ 
/*      */       
/*  185 */       if (week == 6) {
/*  186 */         if (Main.p.getSocial() > 30) {
/*  187 */           Main.infoBox("You just received an invitation to an epic Halloween Party from your friend! You dress up as the IB logo and instantly become a IB-community-wide meme.\nYour stress becomes 0, your stress limit increases by 10 and your social increases by 20.", "YAAY!");
/*  188 */           Main.p.setStress(0);
/*  189 */           Main.p.setStressLimit(Main.p.getStressLimit() + 10);
/*  190 */           Main.p.setSocial(Main.p.getSocial() + 20);
/*      */         } else {
/*      */           
/*  193 */           Main.infoBox("You have a weird feeling that you missed out on something.\nYour stress increases by 1.", "Huh?");
/*  194 */           Main.p.setStress(Main.p.getStress() + 1);
/*      */         }
/*      */       
/*  197 */       } else if (week == 7) {
/*  198 */         if (Main.p.getG1_score() > 25 && Main.p.getG2_score() > 25 && Main.p.getG3_score() > 25 && Main.p.getG4_score() > 25 && Main.p.getG5_score() > 25 && Main.p.getG6_score() > 25) {
/*  199 */           Main.infoBox("You did really well on your finals!\nAll of your subject scores increases by 25.", "YAAY!");
/*  200 */           Main.p.setG6_score(Main.p.getG6_score() + 25);
/*  201 */           Main.p.setG5_score(Main.p.getG5_score() + 25);
/*  202 */           Main.p.setG4_score(Main.p.getG4_score() + 25);
/*  203 */           Main.p.setG3_score(Main.p.getG3_score() + 25);
/*  204 */           Main.p.setG2_score(Main.p.getG2_score() + 25);
/*  205 */           Main.p.setG1_score(Main.p.getG1_score() + 25);
/*      */         } else {
/*      */           
/*  208 */           Main.infoBox("You didn't do too well on your finals.:(\nYour subject scores remain the same.", "Oops!");
/*      */         }
/*      */       
/*  211 */       } else if (week != 8) {
/*      */ 
/*      */         
/*  214 */         if (week == 9) {
/*  215 */           if (Main.p.getG6_score() > 60) {
/*  216 */             Main.infoBox("Your " + Main.p.getG6_subject()[1] + " teacher announces a pop quiz! Thankfully, you knew the material pretty well.\nYour Group 6 score increases by 30.", "YAAY!");
/*  217 */             Main.p.setG6_score(Main.p.getG6_score() + 30);
/*      */           } else {
/*      */             
/*  220 */             Main.infoBox("Your " + Main.p.getG6_subject()[1] + " teacher announces a pop quiz! Unfortunately, you can't remember the relevant material.\nYour Group 6 does not improve.", "Oops!");
/*      */           }
/*      */         
/*  223 */         } else if (week == 10) {
/*  224 */           Main.infoBox("Your homeroom teacher announces the date for finals! You have approximately two months to prepare. Make sure you have at least some confidence in all subjects.", "OOH!");
/*      */         }
/*  226 */         else if (week == 11) {
/*  227 */           if (Main.p.getSocial() > 50) {
/*  228 */             Main.infoBox("You just received an invitation to an epic after party! You play pin-the-dot on the IB logo until dawn.\nYour stress becomes 0, your stress limit increases by 10 and your social increases by 20.", "YAAY!");
/*  229 */             Main.p.setStress(0);
/*  230 */             Main.p.setStressLimit(Main.p.getStressLimit() + 10);
/*  231 */             Main.p.setSocial(Main.p.getSocial() + 20);
/*      */           } else {
/*      */             
/*  234 */             Main.infoBox("You have a weird feeling that you missed out on something.\nYour stress increases by 1.", "Huh?");
/*  235 */             Main.p.setStress(Main.p.getStress() + 1);
/*      */           }
/*      */         
/*  238 */         } else if (week == 12) {
/*  239 */           if (Main.p.getG3_score() > 70) {
/*  240 */             Main.infoBox("Your " + Main.p.getG3_subject()[1] + " teacher announces a pop quiz! Thankfully, you knew the material pretty well.\nYour Group 3 score increases by 30.", "YAAY!");
/*  241 */             Main.p.setG3_score(Main.p.getG3_score() + 30);
/*      */           } else {
/*      */             
/*  244 */             Main.infoBox("Your " + Main.p.getG3_subject()[1] + " teacher announces a pop quiz! Unfortunately, you can't remember the relevant material.\nYour Group 3 does not improve.", "Oops!");
/*      */           }
/*      */         
/*  247 */         } else if (week == 13) {
/*  248 */           if (Main.p.getSocial() > 100) {
/*  249 */             Main.infoBox("You just received a promposal from your crush! You two have a fantastic night together at prom -- you're even prom queen!\nYour stress becomes 0, your stress limit increases by 30 and your social increases by 100.", "YAAY!");
/*  250 */             Main.p.setStress(0);
/*  251 */             Main.p.setStressLimit(Main.p.getStressLimit() + 30);
/*  252 */             Main.p.setSocial(Main.p.getSocial() + 100);
/*      */           }
/*  254 */           else if (Main.p.getSocial() > 40) {
/*  255 */             Main.infoBox("You went to prom with your friends. It was a great night out!\nYour stress becomes 0. Your social increases by 30.", "Oops!");
/*  256 */             Main.p.setStress(0);
/*  257 */             Main.p.setSocial(Main.p.getSocial() + 30);
/*      */           } else {
/*      */             
/*  260 */             Main.infoBox("You didn't go to prom. You tried to study, but you couldn't help but feel a bit sad when you saw pictures of your classmates having a blast.\nYour stress increases by 10.", "Oops!");
/*  261 */             Main.p.setStress(Main.p.getStress() + 10);
/*      */           }
/*      */         
/*  264 */         } else if (week == 14) {
/*  265 */           int n = 10 - Main.p.getCas();
/*  266 */           if (Main.p.getCas() > 5) {
/*  267 */             Main.infoBox("Your IB coordinator commends you for your good CAS records! Keep it up, " + Main.p.getFirstName() + "! You need " + n + " more sessions to meet the IB requirements.", "YAAY!");
/*      */           } else {
/*      */             
/*  270 */             Main.infoBox("Your IB coordinator scolds you for your lacking CAS records! You need " + n + " more sessions to meet the IB requirements.", "Oops!");
/*      */           }
/*      */         
/*  273 */         } else if (week == 15) {
/*  274 */           if (Main.p.getG1_score() > 100 && Main.p.getG2_score() > 100 && Main.p.getG3_score() > 100 && Main.p.getG4_score() > 100 && Main.p.getG5_score() > 100 && Main.p.getG6_score() > 100) {
/*  275 */             Main.infoBox("You did really well on your finals!\nAll of your subject scores increases by 20.", "YAAY!");
/*  276 */             Main.p.setG6_score(Main.p.getG6_score() + 20);
/*  277 */             Main.p.setG5_score(Main.p.getG5_score() + 20);
/*  278 */             Main.p.setG4_score(Main.p.getG4_score() + 20);
/*  279 */             Main.p.setG3_score(Main.p.getG3_score() + 20);
/*  280 */             Main.p.setG2_score(Main.p.getG2_score() + 20);
/*  281 */             Main.p.setG1_score(Main.p.getG1_score() + 20);
/*      */           } else {
/*      */             
/*  284 */             Main.infoBox("You didn't do too well on your finals.:(\nYour subject scores remain the same.", "Oops!");
/*      */           }
/*      */         
/*  287 */         } else if (week != 16) {
/*      */ 
/*      */           
/*  290 */           if (week == 17) {
/*  291 */             Main.infoBox("You start your CAS project. It takes a while to choose a good project, but you team up with your best buddies and get to work.\nYour stress increases by 10.", "Ooh!");
/*  292 */             Main.p.setStress(Main.p.getStress() + 10);
/*      */           }
/*  294 */           else if (week == 18) {
/*  295 */             if (Main.p.getG5_score() > 150) {
/*  296 */               Main.infoBox("Your " + Main.p.getG5_subject()[1] + " teacher announces a pop quiz! Thankfully, you knew the material pretty well.\nYour Group 5 score increases by 30.", "YAAY!");
/*  297 */               Main.p.setG5_score(Main.p.getG5_score() + 30);
/*      */             } else {
/*      */               
/*  300 */               Main.infoBox("Your " + Main.p.getG5_subject()[1] + " teacher announces a pop quiz! Unfortunately, you can't remember the relevant material.\nYour Group 5 does not improve.", "Oops!");
/*      */             }
/*      */           
/*  303 */           } else if (week == 19) {
/*  304 */             if (Main.p.getSocial() > 150) {
/*  305 */               Main.infoBox("You just received an invitation to your friend's epic birthday party! You hungrily destroy an IB-logo shaped cake and have a blast.\nYour stress becomes 0, your stress limit increases by 10 and your social increases by 20.", "YAAY!");
/*  306 */               Main.p.setStress(0);
/*  307 */               Main.p.setStressLimit(Main.p.getStressLimit() + 10);
/*  308 */               Main.p.setSocial(Main.p.getSocial() + 20);
/*      */             } else {
/*      */               
/*  311 */               Main.infoBox("You have a weird feeling that you missed out on something.\nYour stress increases by 1.", "Huh?");
/*  312 */               Main.p.setStress(Main.p.getStress() + 1);
/*      */             }
/*      */           
/*  315 */           } else if (week == 20) {
/*  316 */             Main.infoBox("You finish your CAS project! You can't help but feel some pride in your awesome work. Well Done!\nYour stress becomes 0.", "YAAY!");
/*  317 */             Main.p.setStress(0);
/*      */           }
/*  319 */           else if (week == 21) {
/*  320 */             if (Main.p.getG2_score() > 170) {
/*  321 */               Main.infoBox("Your " + Main.p.getG2_subject()[1] + " teacher announces a pop quiz! Thankfully, you knew the material pretty well.\nYour Group 2 score increases by 30.", "YAAY!");
/*  322 */               Main.p.setG2_score(Main.p.getG2_score() + 30);
/*      */             } else {
/*      */               
/*  325 */               Main.infoBox("Your " + Main.p.getG2_subject()[1] + " teacher announces a pop quiz! Unfortunately, you can't remember the relevant material.\nYour Group 2 does not improve.", "Oops!");
/*      */             }
/*      */           
/*  328 */           } else if (week == 22) {
/*  329 */             if (Main.p.getSocial() > 200) {
/*  330 */               Main.infoBox("You just received an invitation to your friend's epic birthday party! You hungrily destroy an IB-logo shaped cake and have a blast.\nYour stress becomes 0, your stress limit increases by 10 and your social increases by 20.", "YAAY!");
/*  331 */               Main.p.setStress(0);
/*  332 */               Main.p.setStressLimit(Main.p.getStressLimit() + 10);
/*  333 */               Main.p.setSocial(Main.p.getSocial() + 20);
/*      */             } else {
/*      */               
/*  336 */               Main.infoBox("You have a weird feeling that you missed out on something.\nYour stress increases by 1.", "Huh?");
/*  337 */               Main.p.setStress(Main.p.getStress() + 1);
/*      */             }
/*      */           
/*  340 */           } else if (week == 23) {
/*  341 */             if (Main.p.getG1_score() > 200 && Main.p.getG2_score() > 200 && Main.p.getG3_score() > 200 && Main.p.getG4_score() > 200 && Main.p.getG5_score() > 200 && Main.p.getG6_score() > 200) {
/*  342 */               Main.infoBox("You did really well on your finals!\nAll of your subject scores increases by 20.", "YAAY!");
/*  343 */               Main.p.setG6_score(Main.p.getG6_score() + 20);
/*  344 */               Main.p.setG5_score(Main.p.getG5_score() + 20);
/*  345 */               Main.p.setG4_score(Main.p.getG4_score() + 20);
/*  346 */               Main.p.setG3_score(Main.p.getG3_score() + 20);
/*  347 */               Main.p.setG2_score(Main.p.getG2_score() + 20);
/*  348 */               Main.p.setG1_score(Main.p.getG1_score() + 20);
/*      */             } else {
/*      */               
/*  351 */               Main.infoBox("You didn't do too well on your finals.:(\nYour subject scores remain the same.", "Oops!");
/*      */             }
/*      */           
/*  354 */           } else if (week != 24) {
/*      */ 
/*      */             
/*  357 */             if (week == 25)
/*  358 */             { int n = 15 - Main.p.getCas();
/*  359 */               if (Main.p.getCas() > 12) {
/*  360 */                 Main.infoBox("Your IB coordinator commends you for your good CAS records! Keep it up, " + Main.p.getFirstName() + "! You need " + n + " more sessions to meet the IB requirements.", "YAAY!");
/*      */               } else {
/*      */                 
/*  363 */                 Main.infoBox("Your IB coordinator scolds you for your lacking CAS records! You need " + n + " more sessions to meet the IB requirements.", "Oops!");
/*      */               }
/*      */                }
/*  366 */             else if (week == 26)
/*  367 */             { if (Main.p.getG1_score() > 220) {
/*  368 */                 Main.infoBox("Your " + Main.p.getG1_subject()[1] + " teacher announces a pop quiz! Thankfully, you knew the material pretty well.\nYour Group 1 score increases by 30.", "YAAY!");
/*  369 */                 Main.p.setG1_score(Main.p.getG1_score() + 30);
/*      */               } else {
/*      */                 
/*  372 */                 Main.infoBox("Your " + Main.p.getG1_subject()[1] + " teacher announces a pop quiz! Unfortunately, you can't remember the relevant material.\nYour Group 1 does not improve.", "Oops!");
/*      */               }
/*      */                }
/*  375 */             else if (week == 27)
/*  376 */             { if (Main.p.getSocial() > 300) {
/*  377 */                 Main.infoBox("You just received a promposal from your crush! You two have a fantastic night together at prom -- you're even prom queen!\nYour stress becomes 0, your stress limit increases by 30 and your social increases by 100.", "YAAY!");
/*  378 */                 Main.p.setStress(0);
/*  379 */                 Main.p.setStressLimit(Main.p.getStressLimit() + 30);
/*  380 */                 Main.p.setSocial(Main.p.getSocial() + 100);
/*      */               }
/*  382 */               else if (Main.p.getSocial() > 150) {
/*  383 */                 Main.infoBox("You went to prom with your friends. It was a great night out!\nYour stress becomes 0. Your social increases by 30.", "Yaay!");
/*  384 */                 Main.p.setStress(0);
/*  385 */                 Main.p.setSocial(Main.p.getSocial() + 30);
/*      */               } else {
/*      */                 
/*  388 */                 Main.infoBox("You didn't go to prom. You tried to study, but you couldn't help but feel a bit sad when you saw pictures of your classmates having a blast.\nYour stress increases by 10.", "Oops!");
/*  389 */                 Main.p.setStress(Main.p.getStress() + 10);
/*      */               }
/*      */                }
/*  392 */             else if (week == 28)
/*  393 */             { if (Main.p.getG1_score() > 250 && Main.p.getG2_score() > 250 && Main.p.getG3_score() > 250 && Main.p.getG4_score() > 250 && Main.p.getG5_score() > 250 && Main.p.getG6_score() > 250) {
/*  394 */                 Main.infoBox("You did really well in your mock exams!\nAll of your subject scores increases by 50.", "YAAY!");
/*  395 */                 Main.p.setG6_score(Main.p.getG6_score() + 50);
/*  396 */                 Main.p.setG5_score(Main.p.getG5_score() + 50);
/*  397 */                 Main.p.setG4_score(Main.p.getG4_score() + 50);
/*  398 */                 Main.p.setG3_score(Main.p.getG3_score() + 50);
/*  399 */                 Main.p.setG2_score(Main.p.getG2_score() + 50);
/*  400 */                 Main.p.setG1_score(Main.p.getG1_score() + 50);
/*      */               } else {
/*      */                 
/*  403 */                 Main.infoBox("You didn't do too well on your mock exams.:(\nYour subject scores remain the same.", "Oops!");
/*      */               }
/*      */                }
/*  406 */             else if (week == 29)
/*  407 */             { Main.infoBox("You just ate lunch with your closest friends. You wish each other the best of luck in the coming weeks of the still quite dreadful IB Finals.\nYou are filled with determination.\nYour stress becomes 0. Your stress limit increases by 10000.", "YAAY!");
/*  408 */               Main.p.setStress(0);
/*  409 */               Main.p.setStressLimit(Main.p.getStressLimit() + 10000); } 
/*      */           } 
/*      */         } 
/*      */       } 
/*  413 */     }  JLabel lblChar = new JLabel("");
/*  414 */     lblChar.setHorizontalAlignment(0);
/*  415 */     lblChar.setBounds(26, 32, 275, 507);
/*  416 */     this.contentPane.add(lblChar);
/*  417 */     if (Main.p.getGender().equalsIgnoreCase("F")) { url = Main.class.getResource("/f.jpg"); }
/*  418 */     else { url = Main.class.getResource("/m.jpg"); }
/*  419 */      lblChar.setIcon(new ImageIcon(url));
/*      */     
/*  421 */     URL url2 = Main.class.getResource("/bg.jpg");
/*  422 */     JLabel lblBg = new JLabel("");
/*  423 */     lblBg.setHorizontalAlignment(0);
/*  424 */     lblBg.setBounds(0, 0, 1050, 600);
/*  425 */     this.contentPane.add(lblBg);
/*  426 */     lblBg.setIcon(new ImageIcon(url2));
/*      */   }
/*      */   
/*      */   public void eventManager(JTextArea textPane, int i) {
/*  430 */     System.out.println("weekschedule opened");
/*  431 */     textPane.append("[" + Schedule.cellTable[Main.p.getWeekSchedule()[i]][i] + "]\n");
/*      */     
/*  433 */     Random rand = new Random();
/*  434 */     int n = rand.nextInt(10);
/*      */     
/*  436 */     System.out.println("\nweekschedule " + i);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  441 */     if ((i == 0 && Main.p.getWeekSchedule()[0] == 6) || (i == 1 && Main.p.getWeekSchedule()[1] == 9) || (i == 2 && Main.p.getWeekSchedule()[2] == 6) || (
/*  442 */       i == 3 && Main.p.getWeekSchedule()[3] == 4)) {
/*      */       
/*  444 */       if (n == 0) {
/*  445 */         textPane.append("Today is your day, social butterfly!\n");
/*  446 */         textPane.append(">> Socialization and de-stress twice as effective.\n");
/*  447 */         textPane.append(">> Social + " + (Main.p.getIntelGain() * 2) + " / Stress - 10 \n\n\n");
/*  448 */         Main.p.setSocial(Main.p.getSocial() + Main.p.getIntelGain() * 2);
/*  449 */         if (Main.p.getStress() >= 10) { Main.p.setStress(Main.p.getStress() - 10); }
/*  450 */         else { Main.p.setStress(0); }
/*      */       
/*  452 */       } else if (n < 7) {
/*  453 */         textPane.append("You socialized a lot today. It's nice to hang out with friends to talk about how all of you are in this together.");
/*  454 */         textPane.append(" Of course, you also laugh about the possibility of failing the IB. All for good fun.\n");
/*  455 */         textPane.append(">> Social + " + Main.p.getIntelGain() + " / Stress - 5\n\n\n");
/*  456 */         Main.p.setSocial(Main.p.getSocial() + Main.p.getIntelGain());
/*  457 */         if (Main.p.getStress() >= 5) { Main.p.setStress(Main.p.getStress() - 5); }
/*  458 */         else { Main.p.setStress(0); }
/*      */       
/*  460 */       } else if (n < 10) {
/*  461 */         textPane.append("Something just didn't click. Everyone just looks so TIRED today. Nobody was really in the mood to talk.\n");
/*  462 */         textPane.append(">> Socialization less effective; Stress + 5\n");
/*  463 */         textPane.append(">> Social + " + Main.p.getIntelGain() + " / Stress + 5\n\n\n");
/*  464 */         Main.p.setSocial(Main.p.getSocial() + Main.p.getIntelGain() - 3);
/*  465 */         Main.p.setStress(Main.p.getStress() + 5);
/*      */       } else {
/*      */         
/*  468 */         System.out.println("엥?");
/*      */       
/*      */       }
/*      */     
/*      */     }
/*  473 */     else if ((i == 0 && Main.p.getWeekSchedule()[0] == 7) || (i == 1 && Main.p.getWeekSchedule()[1] == 10) || (i == 3 && Main.p.getWeekSchedule()[3] == 5)) {
/*      */       
/*  475 */       if (n == 0) {
/*  476 */         textPane.append("Today is your day, lazy sloth!\n");
/*  477 */         textPane.append(">> De-stress twice as effective.\n");
/*  478 */         textPane.append(">> Stress - 30 \n\n\n");
/*  479 */         if (Main.p.getStress() >= 30) { Main.p.setStress(Main.p.getStress() - 30); }
/*  480 */         else { Main.p.setStress(0); }
/*      */       
/*  482 */       } else if (n < 8) {
/*  483 */         textPane.append("Why does relaxing feel so good? Mmm, the sweetness of life.\n");
/*  484 */         textPane.append(">> Stress - 15 \n\n\n");
/*  485 */         if (Main.p.getStress() >= 15) { Main.p.setStress(Main.p.getStress() - 15); }
/*  486 */         else { Main.p.setStress(0); }
/*      */       
/*  488 */       } else if (n < 10) {
/*  489 */         textPane.append("You don't know why, but you seem RESTless. Although you struggle to relax yourself, you only end up stressing yourself out even more than you were.\n");
/*  490 */         textPane.append(">> Oops. Gain stress.\n");
/*  491 */         textPane.append(">> Stress + 5\n\n\n");
/*  492 */         Main.p.setStress(Main.p.getStress() + 5);
/*      */       } else {
/*      */         
/*  495 */         System.out.println("엥?");
/*      */       
/*      */       }
/*      */     
/*      */     }
/*  500 */     else if ((i == 1 && Main.p.getWeekSchedule()[1] == 6) || (i == 3 && Main.p.getWeekSchedule()[3] == 0)) {
/*      */       
/*  502 */       Main.p.setCas(Main.p.getCas() + 1);
/*      */       
/*  504 */       if (n == 0) {
/*  505 */         textPane.append("Today is your day, creative guru!\n");
/*  506 */         textPane.append(">> Qoa gain twice as effective. Also de-stress.\n");
/*  507 */         textPane.append(">> Qoa + " + (Main.p.getIntelGain() * 2) + " / Stress - 10 \n\n\n");
/*  508 */         Main.p.setQoa(Main.p.getQoa() + Main.p.getIntelGain() * 2);
/*  509 */         if (Main.p.getStress() >= 10) { Main.p.setStress(Main.p.getStress() - 10); }
/*  510 */         else { Main.p.setStress(0); }
/*      */       
/*  512 */       } else if (n < 7) {
/*  513 */         textPane.append("You feel creative today and was able to put in the effort needed to end up with something satisfactory. Well Done!\n");
/*  514 */         textPane.append(">> Qoa + " + Main.p.getIntelGain() + "\n\n\n");
/*  515 */         Main.p.setQoa(Main.p.getQoa() + Main.p.getIntelGain());
/*      */       }
/*  517 */       else if (n < 10) {
/*  518 */         textPane.append("You ended up runing your artistic project! :( Now you need to start all over again.\n");
/*  519 */         textPane.append(">> Oops. Gain stress.\n");
/*  520 */         textPane.append(">> Stress + 10\n\n\n");
/*  521 */         Main.p.setStress(Main.p.getStress() + 10);
/*      */       } else {
/*      */         
/*  524 */         System.out.println("엥?");
/*      */       
/*      */       }
/*      */     
/*      */     }
/*  529 */     else if (i == 3 && Main.p.getWeekSchedule()[3] == 6) {
/*      */       
/*  531 */       if (Main.p.getEe() == 0) {
/*  532 */         textPane.append("You are planning your your first draft.\n");
/*  533 */         textPane.append("Your teacher predicts a D. With every future EE session scheduled, your grade will most likely go up by one step.\n");
/*  534 */         textPane.append(">> EE + 1 / Stress + " + Main.p.getStressGain() + "\n\n\n");
/*  535 */         Main.p.setEe(Main.p.getEe() + 1);
/*  536 */         Main.p.setStress(Main.p.getStress() + Main.p.getStressGain());
/*      */       }
/*  538 */       else if (Main.p.getEe() == 1) {
/*  539 */         textPane.append("You completed your first draft! The EE requirement is over.\n");
/*  540 */         textPane.append("Your teacher predicts a C. With every future EE session scheduled, your grade will most likely go up by one step.\n");
/*  541 */         textPane.append(">> EE + 1 / Stress + " + Main.p.getStressGain() + "\n\n\n");
/*  542 */         Main.p.setEe(Main.p.getEe() + 1);
/*  543 */         Main.p.setStress(Main.p.getStress() + Main.p.getStressGain());
/*      */       }
/*  545 */       else if (Main.p.getEe() == 2) {
/*  546 */         textPane.append("You are refining your first draft.\n");
/*  547 */         textPane.append("Your teacher predicts a B. With every future EE session scheduled, your grade will most likely go up by one step.\n");
/*  548 */         textPane.append(">> EE + 1 / Stress + " + Main.p.getStressGain() + "\n\n\n");
/*  549 */         Main.p.setEe(Main.p.getEe() + 1);
/*  550 */         Main.p.setStress(Main.p.getStress() + Main.p.getStressGain());
/*      */       }
/*  552 */       else if (Main.p.getEe() == 3) {
/*  553 */         textPane.append("You completed your Extended Essay!\n");
/*  554 */         textPane.append("Your teacher predicts an A. You are confident that you won't need to edit your EE any further!\n");
/*  555 */         textPane.append(">> EE + 1 / Stress + " + Main.p.getStressGain() + "\n\n\n");
/*  556 */         Main.p.setEe(Main.p.getEe() + 1);
/*  557 */         Main.p.setStress(Main.p.getStress() + Main.p.getStressGain());
/*      */       } else {
/*      */         
/*  560 */         textPane.append("Your EE seems perfect!\n\n\n");
/*      */       
/*      */       }
/*      */     
/*      */     }
/*  565 */     else if (i == 0 && Main.p.getWeekSchedule()[0] == 8) {
/*  566 */       if (Main.p.getTok() == 0) {
/*  567 */         textPane.append("You completed your TOK Presentation!\n");
/*  568 */         textPane.append("Your teacher predicts a D. With every future TOK class scheduled, your grade will most likely go up by one step.\n");
/*  569 */         textPane.append(">> TOK + 1 / Stress + " + Main.p.getStressGain() + "\n\n\n");
/*  570 */         Main.p.setTok(Main.p.getTok() + 1);
/*  571 */         Main.p.setStress(Main.p.getStress() + Main.p.getStressGain());
/*      */       }
/*  573 */       else if (Main.p.getTok() == 1) {
/*  574 */         textPane.append("You completed your TOK Essay draft! The TOK requirement is over.\n");
/*  575 */         textPane.append("Your teacher predicts a C. With every future TOK class scheduled, your grade will most likely go up by one step.\n");
/*  576 */         textPane.append(">> TOK + 1 / Stress + " + Main.p.getStressGain() + "\n\n\n");
/*  577 */         Main.p.setTok(Main.p.getTok() + 1);
/*  578 */         Main.p.setStress(Main.p.getStress() + Main.p.getStressGain());
/*      */       }
/*  580 */       else if (Main.p.getTok() == 2) {
/*  581 */         textPane.append("You refined your TOK Essay.\n");
/*  582 */         textPane.append("Your teacher predicts a B. With every future TOK class scheduled, your grade will most likely go up by one step.\n");
/*  583 */         textPane.append(">> TOK + 1 / Stress + " + Main.p.getStressGain() + "\n\n\n");
/*  584 */         Main.p.setTok(Main.p.getTok() + 1);
/*  585 */         Main.p.setStress(Main.p.getStress() + Main.p.getStressGain());
/*      */       }
/*  587 */       else if (Main.p.getTok() == 3) {
/*  588 */         textPane.append("You completed your TOK Essay.\n");
/*  589 */         textPane.append("Your teacher predicts an A. You are confident that you won't need any more TOK classes!\n");
/*  590 */         textPane.append(">> TOK + 1 / Stress + " + Main.p.getStressGain() + "\n\n\n");
/*  591 */         Main.p.setTok(Main.p.getTok() + 1);
/*  592 */         Main.p.setStress(Main.p.getStress() + Main.p.getStressGain());
/*      */       } else {
/*      */         
/*  595 */         textPane.append("You can't find anything to do in TOK!\n\n\n");
/*      */       
/*      */       }
/*      */ 
/*      */     
/*      */     }
/*  601 */     else if ((i == 1 && Main.p.getWeekSchedule()[1] == 7) || (i == 3 && Main.p.getWeekSchedule()[3] == 1)) {
/*      */       
/*  603 */       Main.p.setCas(Main.p.getCas() + 1);
/*      */       
/*  605 */       if (n == 0) {
/*  606 */         textPane.append("Today is your day, sports guru!\n");
/*  607 */         textPane.append(">> Qoa gain twice as effective. Also de-stress.\n");
/*  608 */         textPane.append(">> Qoa + " + (Main.p.getIntelGain() * 2) + " / Stress - 10 \n\n\n");
/*  609 */         Main.p.setQoa(Main.p.getQoa() + Main.p.getIntelGain() * 2);
/*  610 */         if (Main.p.getStress() >= 10) { Main.p.setStress(Main.p.getStress() - 10); }
/*  611 */         else { Main.p.setStress(0); }
/*      */       
/*  613 */       } else if (n < 7) {
/*  614 */         textPane.append("You feel sporty today and was able to put in the effort needed to meet some of your goals. Well Done!\n");
/*  615 */         textPane.append(">> Qoa + " + Main.p.getIntelGain() + "\n\n\n");
/*  616 */         Main.p.setQoa(Main.p.getQoa() + Main.p.getIntelGain());
/*      */       }
/*  618 */       else if (n < 10) {
/*  619 */         textPane.append("You ended up hurting your ankle! :(\n");
/*  620 */         textPane.append(">> Oops. Gain stress.\n");
/*  621 */         textPane.append(">> Stress + 10 \n\n\n");
/*  622 */         Main.p.setStress(Main.p.getStress() + 10);
/*      */       } else {
/*      */         
/*  625 */         System.out.println("엥?");
/*      */       
/*      */       }
/*      */     
/*      */     }
/*  630 */     else if ((i == 1 && Main.p.getWeekSchedule()[1] == 8) || (i == 3 && Main.p.getWeekSchedule()[3] == 2)) {
/*      */       
/*  632 */       Main.p.setCas(Main.p.getCas() + 1);
/*      */       
/*  634 */       if (n == 0) {
/*  635 */         textPane.append("Today is your day, service guru!\n");
/*  636 */         textPane.append(">> Qoa gain twice as effective. Also de-stress.\n");
/*  637 */         textPane.append(">> Qoa + " + (Main.p.getIntelGain() * 2) + " / Stress - 10 \n\n\n");
/*  638 */         Main.p.setQoa(Main.p.getQoa() + Main.p.getIntelGain() * 2);
/*  639 */         if (Main.p.getStress() >= 10) { Main.p.setStress(Main.p.getStress() - 10); }
/*  640 */         else { Main.p.setStress(0); }
/*      */       
/*  642 */       } else if (n < 7) {
/*  643 */         textPane.append("You feel like Mother Teresa today and was able to put in the effort needed to meet some of your personal goals. Well Done!\n");
/*  644 */         textPane.append(">> Qoa + " + Main.p.getIntelGain() + "\n\n\n");
/*  645 */         Main.p.setQoa(Main.p.getQoa() + Main.p.getIntelGain());
/*      */       }
/*  647 */       else if (n < 10) {
/*  648 */         textPane.append("You're just not feeling up to it today.\n");
/*  649 */         textPane.append(">> Oops. Gain stress.\n");
/*  650 */         textPane.append(">> Stress + 10 \n\n\n");
/*  651 */         Main.p.setStress(Main.p.getStress() + 10);
/*      */       } else {
/*      */         
/*  654 */         System.out.println("엥?");
/*      */       
/*      */       }
/*      */     
/*      */     }
/*  659 */     else if (i == 3 && Main.p.getWeekSchedule()[3] == 3) {
/*      */ 
/*      */       
/*  662 */       int j = compareScores(Main.p.getG1_score(), Main.p.getG2_score(), Main.p.getG3_score(), Main.p.getG4_score(), Main.p.getG5_score(), Main.p.getG6_score());
/*      */       
/*  664 */       if (n == 0) {
/*  665 */         textPane.append("Woah, the progress you made is amazing!\n");
/*  666 */         textPane.append(">> Qoa gain twice as effective. Your progress on your best subject is twice as effective.\n");
/*  667 */         textPane.append(">> Qoa + " + (Main.p.getIntelGain() * 2) + "\n");
/*  668 */         Main.p.setQoa(Main.p.getQoa() + Main.p.getIntelGain() * 2);
/*  669 */         if (Main.p.getG1_score() == j) {
/*  670 */           textPane.append(">> Group 1 + " + (Main.p.getIntelGain() * 2) + "\n\n\n");
/*  671 */           Main.p.setG1_score(Main.p.getG1_score() + Main.p.getIntelGain() * 2);
/*      */         }
/*  673 */         else if (Main.p.getG2_score() == j) {
/*  674 */           textPane.append(">> Group 2 + " + (Main.p.getIntelGain() * 2) + "\n\n\n");
/*  675 */           Main.p.setG2_score(Main.p.getG2_score() + Main.p.getIntelGain() * 2);
/*      */         }
/*  677 */         else if (Main.p.getG3_score() == j) {
/*  678 */           textPane.append(">> Group 3 + " + (Main.p.getIntelGain() * 2) + "\n\n\n");
/*  679 */           Main.p.setG3_score(Main.p.getG3_score() + Main.p.getIntelGain() * 2);
/*      */         }
/*  681 */         else if (Main.p.getG4_score() == j) {
/*  682 */           textPane.append(">> Group 4 + " + (Main.p.getIntelGain() * 2) + "\n\n\n");
/*  683 */           Main.p.setG4_score(Main.p.getG4_score() + Main.p.getIntelGain() * 2);
/*      */         }
/*  685 */         else if (Main.p.getG5_score() == j) {
/*  686 */           textPane.append(">> Group 5 + " + (Main.p.getIntelGain() * 2) + "\n\n\n");
/*  687 */           Main.p.setG5_score(Main.p.getG5_score() + Main.p.getIntelGain() * 2);
/*      */         }
/*  689 */         else if (Main.p.getG6_score() == j) {
/*  690 */           textPane.append(">> Group 6 + " + (Main.p.getIntelGain() * 2) + "\n\n\n");
/*  691 */           Main.p.setG6_score(Main.p.getG6_score() + Main.p.getIntelGain() * 2);
/*      */         }
/*      */       
/*      */       }
/*  695 */       else if (n < 7) {
/*  696 */         textPane.append("You made some progress today.\n");
/*  697 */         textPane.append(">> Qoa + " + Main.p.getIntelGain() + "\n");
/*  698 */         Main.p.setQoa(Main.p.getQoa() + Main.p.getIntelGain()); for (int x = 0; x < 6; x++) {
/*  699 */           if (Main.p.getG1_score() == j) {
/*  700 */             textPane.append(">> Group 1 + " + Main.p.getIntelGain() + "\n\n\n");
/*  701 */             Main.p.setG1_score(Main.p.getG1_score() + Main.p.getIntelGain());
/*      */           }
/*  703 */           else if (Main.p.getG2_score() == j) {
/*  704 */             textPane.append(">> Group 2 + " + Main.p.getIntelGain() + "\n\n\n");
/*  705 */             Main.p.setG2_score(Main.p.getG2_score() + Main.p.getIntelGain());
/*      */           }
/*  707 */           else if (Main.p.getG3_score() == j) {
/*  708 */             textPane.append(">> Group 3 + " + Main.p.getIntelGain() + "\n\n\n");
/*  709 */             Main.p.setG3_score(Main.p.getG3_score() + Main.p.getIntelGain());
/*      */           }
/*  711 */           else if (Main.p.getG4_score() == j) {
/*  712 */             textPane.append(">> Group 4 + " + Main.p.getIntelGain() + "\n\n\n");
/*  713 */             Main.p.setG4_score(Main.p.getG4_score() + Main.p.getIntelGain());
/*      */           }
/*  715 */           else if (Main.p.getG5_score() == j) {
/*  716 */             textPane.append(">> Group 5 + " + Main.p.getIntelGain() + "\n\n\n");
/*  717 */             Main.p.setG5_score(Main.p.getG5_score() + Main.p.getIntelGain());
/*      */           }
/*  719 */           else if (Main.p.getG6_score() == j) {
/*  720 */             textPane.append(">> Group 6 + " + Main.p.getIntelGain() + "\n\n\n");
/*  721 */             Main.p.setG6_score(Main.p.getG6_score() + Main.p.getIntelGain());
/*      */           }
/*      */         
/*      */         } 
/*  725 */       } else if (n < 10) {
/*  726 */         textPane.append("You don't make much progress.\n");
/*  727 */         textPane.append(">> Oops. Qoa gain reduced.\n");
/*  728 */         textPane.append(">> Stress + 10 / qoa + 3 \n\n\n");
/*  729 */         Main.p.setStress(Main.p.getStress() + 10);
/*  730 */         Main.p.setQoa(Main.p.getQoa() + 3);
/*      */       }
/*      */       else {
/*      */         
/*  734 */         System.out.println("엥?");
/*      */       
/*      */       }
/*      */     
/*      */     }
/*  739 */     else if (i == 2 && Main.p.getWeekSchedule()[2] == 7) {
/*      */       
/*  741 */       textPane.append("You decide to sleep early and reduce some stress.\n");
/*  742 */       textPane.append(">> Always effective de-stress.\n");
/*  743 */       textPane.append(">> Stress - 30 \n\n\n");
/*  744 */       if (Main.p.getStress() >= 30) { Main.p.setStress(Main.p.getStress() - 30); }
/*  745 */       else { Main.p.setStress(0); }
/*      */ 
/*      */     
/*      */     }
/*      */     else {
/*      */       
/*  751 */       int j = Main.p.getWeekSchedule()[i];
/*  752 */       Main.p.setStress(Main.p.getStress() + Main.p.getStressGain());
/*      */       
/*  754 */       if (j == 0) {
/*  755 */         if (n == 0) {
/*  756 */           textPane.append("Woah, the progress you made is amazing!\n");
/*  757 */           textPane.append(">> Your progress on the subject is twice as effective.\n");
/*  758 */           textPane.append(">> Group 1 + " + (Main.p.getIntelGain() * 2) + "\n");
/*  759 */           textPane.append(">> Stress + " + Main.p.getStressGain() + "\n\n\n");
/*      */           
/*  761 */           Main.p.setG1_score(Main.p.getG1_score() + Main.p.getIntelGain() * 2);
/*      */         
/*      */         }
/*  764 */         else if (n < 7) {
/*  765 */           textPane.append("You made some progress today.\n");
/*  766 */           textPane.append(">> Group 1 + " + Main.p.getIntelGain() + "\n");
/*  767 */           textPane.append(">> Stress + " + Main.p.getStressGain() + "\n\n\n");
/*  768 */           Main.p.setG1_score(Main.p.getG1_score() + Main.p.getIntelGain());
/*      */         }
/*  770 */         else if (n < 10) {
/*  771 */           textPane.append("You don't make much progress.\n");
/*  772 */           textPane.append(">> Subject progress gain reduced.\n");
/*  773 */           textPane.append(">> Group 1 + 3 \n");
/*  774 */           textPane.append(">> Stress + " + Main.p.getStressGain() + "\n\n\n");
/*      */           
/*  776 */           Main.p.setG1_score(Main.p.getG1_score() + 3);
/*      */         
/*      */         }
/*      */       
/*      */       }
/*  781 */       else if (j == 1) {
/*  782 */         if (n == 0) {
/*  783 */           textPane.append("Woah, the progress you made is amazing!\n");
/*  784 */           textPane.append(">> Your progress on the subject is twice as effective.\n");
/*  785 */           textPane.append(">> Group 2 + " + (Main.p.getIntelGain() * 2) + "\n");
/*  786 */           textPane.append(">> Stress + " + Main.p.getStressGain() + "\n\n\n");
/*  787 */           Main.p.setG2_score(Main.p.getG2_score() + Main.p.getIntelGain() * 2);
/*      */         
/*      */         }
/*  790 */         else if (n < 7) {
/*  791 */           textPane.append("You made some progress today.\n");
/*  792 */           textPane.append(">> Group 2 + " + Main.p.getIntelGain() + "\n");
/*  793 */           textPane.append(">> Stress + " + Main.p.getStressGain() + "\n\n\n");
/*  794 */           Main.p.setG2_score(Main.p.getG2_score() + Main.p.getIntelGain());
/*      */         
/*      */         }
/*  797 */         else if (n < 10) {
/*  798 */           textPane.append("You don't make much progress.\n");
/*  799 */           textPane.append(">> Oops. Subject progress gain reduced.\n");
/*  800 */           textPane.append(">> Group 2 + 3 \n");
/*  801 */           textPane.append(">> Stress + " + Main.p.getStressGain() + "\n\n\n");
/*  802 */           Main.p.setG2_score(Main.p.getG2_score() + 3);
/*      */         
/*      */         }
/*      */       
/*      */       }
/*  807 */       else if (j == 2) {
/*  808 */         if (n == 0) {
/*  809 */           textPane.append("Woah, the progress you made is amazing!\n");
/*  810 */           textPane.append(">> Your progress on the subject is twice as effective.\n");
/*  811 */           textPane.append(">> Group 3 + " + (Main.p.getIntelGain() * 2) + "\n");
/*  812 */           textPane.append(">> Stress + " + Main.p.getStressGain() + "\n\n\n");
/*  813 */           Main.p.setG3_score(Main.p.getG3_score() + Main.p.getIntelGain() * 2);
/*      */         
/*      */         }
/*  816 */         else if (n < 7) {
/*  817 */           textPane.append("You made some progress today.\n");
/*  818 */           textPane.append(">> Group 3 + " + Main.p.getIntelGain() + "\n");
/*  819 */           textPane.append(">> Stress + " + Main.p.getStressGain() + "\n\n\n");
/*  820 */           Main.p.setG3_score(Main.p.getG3_score() + Main.p.getIntelGain());
/*      */         
/*      */         }
/*  823 */         else if (n < 10) {
/*  824 */           textPane.append("You don't make much progress.\n");
/*  825 */           textPane.append(">> Oops. Subject progress gain reduced.\n");
/*  826 */           textPane.append(">> Group 3 + 3 \n");
/*  827 */           textPane.append(">> Stress + " + Main.p.getStressGain() + "\n\n\n");
/*      */           
/*  829 */           Main.p.setG3_score(Main.p.getG3_score() + 3);
/*      */         }
/*      */       
/*      */       }
/*  833 */       else if (j == 3) {
/*  834 */         if (n == 0) {
/*  835 */           textPane.append("Woah, the progress you made is amazing!\n");
/*  836 */           textPane.append(">> Your progress on the subject is twice as effective.\n");
/*  837 */           textPane.append(">> Group 4 + " + (Main.p.getIntelGain() * 2) + "\n");
/*  838 */           textPane.append(">> Stress + " + Main.p.getStressGain() + "\n\n\n");
/*  839 */           Main.p.setG4_score(Main.p.getG4_score() + Main.p.getIntelGain() * 2);
/*      */         
/*      */         }
/*  842 */         else if (n < 7) {
/*  843 */           textPane.append("You made some progress today.\n");
/*  844 */           textPane.append(">> Group 4 + " + Main.p.getIntelGain() + "\n");
/*  845 */           textPane.append(">> Stress + " + Main.p.getStressGain() + "\n\n\n");
/*  846 */           Main.p.setG4_score(Main.p.getG4_score() + Main.p.getIntelGain());
/*      */         }
/*  848 */         else if (n < 10) {
/*  849 */           textPane.append("You don't make much progress.\n");
/*  850 */           textPane.append(">> Oops. Subject progress gain reduced.\n");
/*  851 */           textPane.append(">> Group 4 + 3 \n");
/*  852 */           textPane.append(">> Stress + " + Main.p.getStressGain() + "\n\n\n");
/*      */           
/*  854 */           Main.p.setG4_score(Main.p.getG4_score() + 3);
/*      */         }
/*      */       
/*      */       }
/*  858 */       else if (j == 4) {
/*  859 */         if (n == 0) {
/*  860 */           textPane.append("Woah, the progress you made is amazing!\n");
/*  861 */           textPane.append(">> Your progress on the subject is twice as effective.\n");
/*  862 */           textPane.append(">> Group 5 + " + (Main.p.getIntelGain() * 2) + "\n");
/*  863 */           textPane.append(">> Stress + " + Main.p.getStressGain() + "\n\n\n");
/*      */           
/*  865 */           Main.p.setG5_score(Main.p.getG5_score() + Main.p.getIntelGain() * 2);
/*      */         
/*      */         }
/*  868 */         else if (n < 7) {
/*  869 */           textPane.append("You made some progress today.\n");
/*  870 */           textPane.append(">> Group 5 + " + Main.p.getIntelGain() + "\n");
/*  871 */           textPane.append(">> Stress + " + Main.p.getStressGain() + "\n\n\n");
/*      */           
/*  873 */           Main.p.setG5_score(Main.p.getG5_score() + Main.p.getIntelGain());
/*      */         
/*      */         }
/*  876 */         else if (n < 10) {
/*  877 */           textPane.append("You don't make much progress.\n");
/*  878 */           textPane.append(">> Oops. Subject progress gain reduced.\n");
/*  879 */           textPane.append(">> Group 5 + 3 \n");
/*  880 */           textPane.append(">> Stress + " + Main.p.getStressGain() + "\n\n\n");
/*      */           
/*  882 */           Main.p.setG5_score(Main.p.getG5_score() + 3);
/*      */         
/*      */         }
/*      */       
/*      */       }
/*  887 */       else if (j == 5) {
/*  888 */         if (n == 0) {
/*  889 */           textPane.append("Woah, the progress you made is amazing!\n");
/*  890 */           textPane.append(">> Your progress on the subject is twice as effective.\n");
/*  891 */           textPane.append(">> Group 6 + " + (Main.p.getIntelGain() * 2) + "\n");
/*  892 */           textPane.append(">> Stress + " + Main.p.getStressGain() + "\n\n\n");
/*  893 */           Main.p.setG6_score(Main.p.getG6_score() + Main.p.getIntelGain() * 2);
/*      */         
/*      */         }
/*  896 */         else if (n < 7) {
/*  897 */           textPane.append("You made some progress today.\n");
/*  898 */           textPane.append(">> Group 6 + " + Main.p.getIntelGain() + "\n");
/*  899 */           textPane.append(">> Stress + " + Main.p.getStressGain() + "\n\n\n");
/*  900 */           Main.p.setG6_score(Main.p.getG6_score() + Main.p.getIntelGain());
/*      */         
/*      */         }
/*  903 */         else if (n < 10) {
/*  904 */           textPane.append("You don't make much progress.\n");
/*  905 */           textPane.append(">> Oops. Subject progress gain reduced.\n");
/*  906 */           textPane.append(">> Group 6 + 3 \n");
/*  907 */           textPane.append(">> Stress + " + Main.p.getStressGain() + "\n\n\n");
/*  908 */           Main.p.setG6_score(Main.p.getG6_score() + 3);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  915 */     if (i == 3) {
/*  916 */       this.btnContinue.setEnabled(false);
/*  917 */       this.btnHome.setEnabled(true);
/*  918 */       Main.p.setWeekSchedule(new int[4]);
/*      */       
/*  920 */       if (Main.p.getWeek() >= 30) {
/*  921 */         this.btnContinue.setEnabled(true);
/*  922 */         this.ibFinals = true;
/*  923 */         textPane.setText("");
/*      */       } 
/*      */       
/*  926 */       Main.p.setWeek(Main.p.getWeek() + 1);
/*  927 */       if (Main.p.getStress() > Main.p.getStressLimit()) {
/*  928 */         Main.p.setSick(true);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public int compareScores(int g1, int g2, int g3, int g4, int g5, int g6) {
/*  934 */     int largest = Math.max(g1, Math.max(g2, Math.max(g3, Math.max(g4, Math.max(g5, g6)))));
/*  935 */     return largest;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void ibFinals() {
/*  941 */     g1_score = Main.p.getG1_score() / 50;
/*  942 */     g2_score = Main.p.getG2_score() / 50;
/*  943 */     g3_score = Main.p.getG3_score() / 50;
/*  944 */     g4_score = Main.p.getG4_score() / 50;
/*  945 */     g5_score = Main.p.getG5_score() / 50;
/*  946 */     g6_score = Main.p.getG6_score() / 50;
/*      */     
/*  948 */     if (g1_score > 7) g1_score = 7; 
/*  949 */     if (g2_score > 7) g2_score = 7; 
/*  950 */     if (g3_score > 7) g3_score = 7; 
/*  951 */     if (g4_score > 7) g4_score = 7; 
/*  952 */     if (g5_score > 7) g5_score = 7; 
/*  953 */     if (g6_score > 7) g6_score = 7;
/*      */     
/*  955 */     if (g1_score == 0) g1_score = 1; 
/*  956 */     if (g2_score == 0) g2_score = 1; 
/*  957 */     if (g3_score == 0) g3_score = 1; 
/*  958 */     if (g4_score == 0) g4_score = 1; 
/*  959 */     if (g5_score == 0) g5_score = 1; 
/*  960 */     if (g6_score == 0) g6_score = 1;
/*      */     
/*  962 */     System.out.println("g1_score: " + g1_score);
/*  963 */     System.out.println("g2_score: " + g1_score);
/*  964 */     System.out.println("g3_score: " + g1_score);
/*  965 */     System.out.println("g4_score: " + g1_score);
/*  966 */     System.out.println("g5_score: " + g1_score);
/*  967 */     System.out.println("g6_score: " + g1_score);
/*      */ 
/*      */     
/*  970 */     int HL_sum = 0;
/*  971 */     int HL_2 = 0;
/*  972 */     int SL_2 = 0;
/*  973 */     int SL_sum = 0;
/*  974 */     int grade_3 = 0;
/*      */     
/*  976 */     bonus = Main.p.getTok() + Main.p.getEe();
/*      */     
/*  978 */     if (bonus == 0) {
/*  979 */       failReason = "- You failed both the EE and TOK.\n";
/*      */     }
/*  981 */     else if (bonus <= 3) {
/*  982 */       bonus = 0;
/*      */     }
/*  984 */     else if (bonus == 4) {
/*  985 */       bonus = 1;
/*      */     }
/*  987 */     else if (bonus >= 7) {
/*  988 */       bonus = 3;
/*      */     }
/*  990 */     else if (bonus < 7 && bonus >= 5) {
/*  991 */       bonus = 2;
/*  992 */       if (Main.p.getTok() - Main.p.getEe() == 1) {
/*  993 */         bonus = 1;
/*      */       }
/*      */     } 
/*      */     
/*  997 */     if (Main.p.getG1_subject()[0].equalsIgnoreCase("HL")) {
/*  998 */       HL_sum += Main.p.getG1_score();
/*  999 */       if (Main.p.getG1_score() <= 2) HL_2++; 
/* 1000 */       if (Main.p.getG1_score() <= 3) grade_3++; 
/*      */     } 
/* 1002 */     if (Main.p.getG2_subject()[0].equalsIgnoreCase("HL")) {
/* 1003 */       HL_sum += Main.p.getG2_score();
/* 1004 */       if (Main.p.getG2_score() <= 2) HL_2++; 
/* 1005 */       if (Main.p.getG2_score() <= 3) grade_3++; 
/*      */     } 
/* 1007 */     if (Main.p.getG3_subject()[0].equalsIgnoreCase("HL")) {
/* 1008 */       HL_sum += Main.p.getG3_score();
/* 1009 */       if (Main.p.getG3_score() <= 2) HL_2++; 
/* 1010 */       if (Main.p.getG3_score() <= 3) grade_3++; 
/*      */     } 
/* 1012 */     if (Main.p.getG4_subject()[0].equalsIgnoreCase("HL")) {
/* 1013 */       HL_sum += Main.p.getG4_score();
/* 1014 */       if (Main.p.getG4_score() <= 2) HL_2++; 
/* 1015 */       if (Main.p.getG4_score() <= 3) grade_3++; 
/*      */     } 
/* 1017 */     if (Main.p.getG5_subject()[0].equalsIgnoreCase("HL")) {
/* 1018 */       HL_sum += Main.p.getG5_score();
/* 1019 */       if (Main.p.getG5_score() <= 2) HL_2++; 
/* 1020 */       if (Main.p.getG5_score() <= 3) grade_3++; 
/*      */     } 
/* 1022 */     if (Main.p.getG6_subject()[0].equalsIgnoreCase("HL")) {
/* 1023 */       HL_sum += Main.p.getG6_score();
/* 1024 */       if (Main.p.getG6_score() <= 2) HL_2++; 
/* 1025 */       if (Main.p.getG6_score() <= 3) grade_3++;
/*      */     
/*      */     } 
/* 1028 */     if (Main.p.getG1_subject()[0].equalsIgnoreCase("SL")) {
/* 1029 */       SL_sum += Main.p.getG1_score();
/* 1030 */       if (Main.p.getG1_score() <= 2) SL_2++; 
/* 1031 */       if (Main.p.getG1_score() <= 3) grade_3++; 
/*      */     } 
/* 1033 */     if (Main.p.getG2_subject()[0].equalsIgnoreCase("SL")) {
/* 1034 */       SL_sum += Main.p.getG2_score();
/* 1035 */       if (Main.p.getG2_score() <= 2) SL_2++; 
/* 1036 */       if (Main.p.getG2_score() <= 3) grade_3++; 
/*      */     } 
/* 1038 */     if (Main.p.getG3_subject()[0].equalsIgnoreCase("SL")) {
/* 1039 */       SL_sum += Main.p.getG3_score();
/* 1040 */       if (Main.p.getG3_score() <= 2) SL_2++; 
/* 1041 */       if (Main.p.getG3_score() <= 3) grade_3++; 
/*      */     } 
/* 1043 */     if (Main.p.getG4_subject()[0].equalsIgnoreCase("SL")) {
/* 1044 */       SL_sum += Main.p.getG4_score();
/* 1045 */       if (Main.p.getG4_score() <= 2) SL_2++; 
/* 1046 */       if (Main.p.getG4_score() <= 3) grade_3++; 
/*      */     } 
/* 1048 */     if (Main.p.getG5_subject()[0].equalsIgnoreCase("SL")) {
/* 1049 */       SL_sum += Main.p.getG5_score();
/* 1050 */       if (Main.p.getG5_score() <= 2) SL_2++; 
/* 1051 */       if (Main.p.getG5_score() <= 3) grade_3++; 
/*      */     } 
/* 1053 */     if (Main.p.getG6_subject()[0].equalsIgnoreCase("SL")) {
/* 1054 */       SL_sum += Main.p.getG6_score();
/* 1055 */       if (Main.p.getG6_score() <= 2) SL_2++; 
/* 1056 */       if (Main.p.getG6_score() <= 3) grade_3++;
/*      */     
/*      */     } 
/*      */     
/* 1060 */     Main.p.setFinalIBScore(bonus + g1_score + g2_score + g3_score + g4_score + g5_score + g6_score);
/* 1061 */     if (Main.p.isMalpractice()) {
/* 1062 */       failReason = String.valueOf(failReason) + "- You were found guilty of malpractice.\n";
/*      */     }
/* 1064 */     if (g1_score == 1 || g2_score == 1 || g3_score == 1 || g4_score == 1 || g5_score == 1 || g6_score == 1) {
/* 1065 */       failReason = String.valueOf(failReason) + "- There are one or more subjects with grade 1.\n";
/*      */     }
/* 1067 */     if (grade_3 >= 4) {
/* 1068 */       failReason = String.valueOf(failReason) + "- There are four or more subjects with grade 3.\n";
/*      */     }
/* 1070 */     if (Main.p.getCas() < 10) {
/* 1071 */       failReason = String.valueOf(failReason) + "- You did not meet the CAS requirements.\n";
/*      */     }
/*      */ 
/*      */     
/* 1075 */     if (Main.p.getFinalIBScore() < 24) {
/* 1076 */       failReason = String.valueOf(failReason) + "- The final score did not meet the minimum requirements (24).\n";
/*      */     }
/* 1078 */     else if (Main.p.getFinalIBScore() <= 27 && Main.p.getFinalIBScore() >= 24) {
/* 1079 */       if (HL_sum < 12) {
/* 1080 */         failReason = String.valueOf(failReason) + "- The sum of HL grades do not meet minimum requirements (min 12 when final score is between 24 and 27).\n";
/*      */       }
/* 1082 */       if (SL_sum < 9) {
/* 1083 */         failReason = String.valueOf(failReason) + "- The sum of SL grades do not meet minimum requirements (min 9 when final score is between 24 and 27).\n";
/*      */       }
/* 1085 */       if (Main.p.getTok() == 0 || Main.p.getEe() == 0) {
/* 1086 */         failReason = String.valueOf(failReason) + "- You were awarded a grade E in your TOK and/or EE when final score is between 24 and 27.\n";
/*      */       }
/* 1088 */       if (SL_2 >= 2) {
/* 1089 */         failReason = String.valueOf(failReason) + "- Two or more of your SLs are a grade 2 or below.\n";
/*      */       }
/* 1091 */       if (HL_2 >= 1) {
/* 1092 */         failReason = String.valueOf(failReason) + "- At least one of your HLs is a grade 2 or below.\n";
/*      */       }
/*      */     } else {
/*      */       
/* 1096 */       if (HL_sum < 11) {
/* 1097 */         failReason = String.valueOf(failReason) + "- The sum of HL grades do not meet minimum requirements (min 12 when final score is between 24 and 27).\n";
/*      */       }
/* 1099 */       if (SL_sum < 8) {
/* 1100 */         failReason = String.valueOf(failReason) + "- The sum of SL grades do not meet minimum requirements (min 9 when final score is between 24 and 27).\n";
/*      */       }
/* 1102 */       if (Main.p.getTok() == 0 || Main.p.getEe() == 0) {
/* 1103 */         failReason = String.valueOf(failReason) + "- You were awarded a grade E in your TOK and/or EE when final score is between 24 and 27.\n";
/*      */       }
/* 1105 */       if (SL_2 == 3) {
/* 1106 */         failReason = String.valueOf(failReason) + "- All of your SLs are a grade 2 or below.\n";
/*      */       }
/* 1108 */       if (HL_2 >= 2) {
/* 1109 */         failReason = String.valueOf(failReason) + "- At least two of your HLs are a grade 2 or below.\n";
/*      */       }
/*      */     } 
/*      */     
/* 1113 */     if (Main.p.getTok() == 0) {
/* 1114 */       tokScore = "E";
/*      */     }
/* 1116 */     else if (Main.p.getTok() == 1) {
/* 1117 */       tokScore = "D";
/*      */     }
/* 1119 */     else if (Main.p.getTok() == 2) {
/* 1120 */       tokScore = "C";
/*      */     }
/* 1122 */     else if (Main.p.getTok() == 3) {
/* 1123 */       tokScore = "B";
/*      */     }
/* 1125 */     else if (Main.p.getTok() == 4) {
/* 1126 */       tokScore = "A";
/*      */     } 
/*      */     
/* 1129 */     if (Main.p.getEe() == 0) {
/* 1130 */       eeScore = "E";
/*      */     }
/* 1132 */     else if (Main.p.getEe() == 1) {
/* 1133 */       eeScore = "D";
/*      */     }
/* 1135 */     else if (Main.p.getEe() == 2) {
/* 1136 */       eeScore = "C";
/*      */     }
/* 1138 */     else if (Main.p.getEe() == 3) {
/* 1139 */       eeScore = "B";
/*      */     }
/* 1141 */     else if (Main.p.getEe() == 4) {
/* 1142 */       eeScore = "A";
/*      */     } 
/*      */ 
/*      */     
/* 1146 */     if (failReason.equalsIgnoreCase("")) {
/* 1147 */       this.ibFinalText[28] = "YES! You not only survived the IB, but passed it too!";
/* 1148 */       this.ibFinalText[29] = "That's a pretty awesome score you've got there. Hope it makes up for the two years of effort you poured into the IB.";
/* 1149 */       this.ibFinalText[30] = "You take a deep breath in and hurriedly search for your phone to make some verrrry important calls.";
/* 1150 */       this.ibFinalText[31] = "You definitely deserve a few. Everyone needs to know you passed! AND survived the IB!";
/* 1151 */       this.ibFinalText[32] = "Gold medal for you, kid.";
/* 1152 */       this.ibFinalText[33] = "The future is yours.";
/* 1153 */       this.ibFinalText[34] = "";
/*      */     }
/*      */     else {
/*      */       
/* 1157 */       this.ibFinalText[28] = "... Huh, it seems that you failed.";
/* 1158 */       this.ibFinalText[29] = "Well... that's disappointing. Still, the past two years have been very helpful (yet excruciating).";
/* 1159 */       this.ibFinalText[30] = "It's not the end of the world, though. I mean, it's natural to be upset, but let's not dwell to much on it.";
/* 1160 */       this.ibFinalText[31] = "After all, it's summer again. And you did it! You survived the IB!";
/* 1161 */       this.ibFinalText[32] = "Give yourself a little pat on the back. Let's forget about this and enjoy the summer!";
/* 1162 */       this.ibFinalText[33] = "It's a wonderful day outside. Really, it is.";
/* 1163 */       this.ibFinalText[34] = "";
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void displayResults() {
/* 1171 */     String r = "";
/* 1172 */     if (failReason.equalsIgnoreCase("")) {
/* 1173 */       r = "Diploma awarded";
/*      */     } else {
/*      */       
/* 1176 */       r = "Diploma not awarded\n" + failReason;
/*      */     } 
/*      */     
/* 1179 */     String s = String.valueOf(Main.p.getG1_subject()[0]) + " " + Main.p.getG1_subject()[1] + ": " + g1_score + "\n" + 
/* 1180 */       Main.p.getG2_subject()[0] + " " + Main.p.getG2_subject()[1] + ": " + g2_score + "\n" + 
/* 1181 */       Main.p.getG3_subject()[0] + " " + Main.p.getG3_subject()[1] + ": " + g3_score + "\n" + 
/* 1182 */       Main.p.getG4_subject()[0] + " " + Main.p.getG4_subject()[1] + ": " + g4_score + "\n" + 
/* 1183 */       Main.p.getG5_subject()[0] + " " + Main.p.getG5_subject()[1] + ": " + g5_score + "\n" + 
/* 1184 */       Main.p.getG6_subject()[0] + " " + Main.p.getG6_subject()[1] + ": " + g6_score + "\n" + 
/* 1185 */       "Theory Knowl. TK: " + tokScore + "\nExtended Essay: " + eeScore + "\n\n" + 
/* 1186 */       "EE/TOK points: " + bonus + "\nTotal points: " + Main.p.getFinalIBScore() + "\n" + 
/* 1187 */       "Results: " + r;
/* 1188 */     Main.infoBox(s, "F I N A L  R E S U L T (take a screenshot!)");
/* 1189 */     this.ibFinals = false;
/*      */ 
/*      */     
/* 1192 */     if (Main.p.getQoa() > 700) {
/* 1193 */       JOptionPane.showMessageDialog(null, "You were accepted into your dream school.", "E P I L O G U E", -1);
/*      */     }
/* 1195 */     else if (Main.p.getQoa() > 500) {
/* 1196 */       JOptionPane.showMessageDialog(null, "You were accepted into one of your reach schools.", "E P I L O G U E", -1);
/*      */     }
/* 1198 */     else if (Main.p.getQoa() > 300) {
/* 1199 */       JOptionPane.showMessageDialog(null, "You were accepted into one of your match schools.", "E P I L O G U E", -1);
/*      */     } else {
/*      */       
/* 1202 */       JOptionPane.showMessageDialog(null, "You were accepted into one of your safety schools.", "E P I L O G U E", -1);
/*      */     } 
/*      */     
/* 1205 */     dispose();
/* 1206 */     Main m = new Main();
/* 1207 */     m.setVisible(true);
/*      */   }
/*      */ }


/* Location:              C:\Users\82109\Downloads\survIB (v0.1.1).jar!\gui\Schedule_Event.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */