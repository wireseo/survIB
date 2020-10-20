/*     */ package gui;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.net.URL;
/*     */ import java.util.Random;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextArea;
/*     */ import javax.swing.JTextPane;
/*     */ import javax.swing.border.Border;
/*     */ import javax.swing.border.EmptyBorder;
/*     */ import javax.swing.text.SimpleAttributeSet;
/*     */ import javax.swing.text.StyleConstants;
/*     */ import javax.swing.text.StyledDocument;
/*     */ 
/*     */ public class Home extends JFrame {
/*     */   private JPanel contentPane;
/*     */   
/*     */   public Home() {
/*     */     URL url;
/*  30 */     this.options = new String[] { "Internship", "Vacation", "Revise" };
/*  31 */     this.dispose = false;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  36 */     setDefaultCloseOperation(2);
/*  37 */     setBounds(100, 100, 1050, 600);
/*  38 */     this.contentPane = new JPanel();
/*  39 */     this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
/*  40 */     setContentPane(this.contentPane);
/*  41 */     this.contentPane.setLayout((LayoutManager)null);
/*     */     
/*  43 */     if (Main.p.getWeek() == 8 || Main.p.getWeek() == 23) {
/*  44 */       int op = JOptionPane.showOptionDialog(null, "It's Winter Break. Choose what you want to do.", "YAAY!", -1, 1, null, (Object[])this.options, Integer.valueOf(0));
/*     */       
/*  46 */       if (op == 0) {
/*  47 */         Main.infoBox("You decided to intern somewhere for the break. \n>> Qoa + 100", "I N T E R N");
/*  48 */         Main.p.setQoa(Main.p.getQoa() + 100);
/*     */       
/*     */       }
/*  51 */       else if (op == 1) {
/*  52 */         Main.infoBox("You decided to go on vacation. \n>> Stress limit + 100", "V A C A T I O N");
/*  53 */         Main.p.setStressLimit(Main.p.getStressLimit() + 100);
/*     */       
/*     */       }
/*  56 */       else if (op == 2) {
/*  57 */         Main.infoBox("You decided to revise. \n>> All subject scores + 50", "R E V I S E");
/*  58 */         Main.p.setG1_score(Main.p.getG1_score() + 50);
/*  59 */         Main.p.setG2_score(Main.p.getG2_score() + 50);
/*  60 */         Main.p.setG3_score(Main.p.getG3_score() + 50);
/*  61 */         Main.p.setG4_score(Main.p.getG4_score() + 50);
/*  62 */         Main.p.setG5_score(Main.p.getG5_score() + 50);
/*  63 */         Main.p.setG6_score(Main.p.getG6_score() + 50);
/*     */       } 
/*     */       
/*  66 */       Main.p.setWeek(Main.p.getWeek() + 1);
/*     */     }
/*  68 */     else if (Main.p.getWeek() == 16) {
/*  69 */       int op = JOptionPane.showOptionDialog(null, "It's Summer Break. Choose what you want to do.", "YAAY!", -1, 1, null, (Object[])this.options, Integer.valueOf(0));
/*     */       
/*  71 */       if (op == 0) {
/*  72 */         Main.infoBox("You decided to intern somewhere for the break. \n>> Qoa + 200", "I N T E R N");
/*  73 */         Main.p.setQoa(Main.p.getQoa() + 200);
/*     */       
/*     */       }
/*  76 */       else if (op == 1) {
/*  77 */         Main.infoBox("You decided to go on vacation. \n>> Stress limit + 200", "V A C A T I O N");
/*  78 */         Main.p.setStressLimit(Main.p.getStressLimit() + 200);
/*     */       
/*     */       }
/*  81 */       else if (op == 2) {
/*  82 */         Main.infoBox("You decided to revise. \n>> All subject scores + 100", "R E V I S E");
/*  83 */         Main.p.setG1_score(Main.p.getG1_score() + 100);
/*  84 */         Main.p.setG2_score(Main.p.getG2_score() + 100);
/*  85 */         Main.p.setG3_score(Main.p.getG3_score() + 100);
/*  86 */         Main.p.setG4_score(Main.p.getG4_score() + 100);
/*  87 */         Main.p.setG5_score(Main.p.getG5_score() + 100);
/*  88 */         Main.p.setG6_score(Main.p.getG6_score() + 100);
/*     */       } 
/*  90 */       Main.p.setWeek(Main.p.getWeek() + 1);
/*     */     } 
/*     */     
/*  93 */     if (Main.p.isSick()) {
/*  94 */       Main.infoBox("You are sick! You spent a month recovering from your sickness.\nYour body also feels weeker. Your stress limit has decreased by 30.", "");
/*  95 */       if (Main.p.getWeek() != 7 && Main.p.getWeek() != 15 && Main.p.getWeek() != 22 && Main.p.getWeek() != 29) {
/*  96 */         Main.p.setWeek(Main.p.getWeek() + 2);
/*     */       } else {
/*     */         
/*  99 */         Main.p.setWeek(Main.p.getWeek() + 1);
/*     */       } 
/* 101 */       Main.p.setStressLimit(Main.p.getStressLimit() - 20);
/* 102 */       Main.p.setStress(0);
/* 103 */       Main.p.setSick(false);
/*     */     } 
/*     */ 
/*     */     
/* 107 */     System.out.println("G1: " + Main.p.getG1_score());
/* 108 */     System.out.println("G2: " + Main.p.getG2_score());
/* 109 */     System.out.println("G3: " + Main.p.getG3_score());
/* 110 */     System.out.println("G4: " + Main.p.getG4_score());
/* 111 */     System.out.println("G5: " + Main.p.getG5_score());
/* 112 */     System.out.println("G6: " + Main.p.getG6_score());
/*     */     
/* 114 */     Border border = BorderFactory.createLineBorder(Color.BLACK);
/* 115 */     JTextPane textPane_year = new JTextPane();
/* 116 */     textPane_year.setFont(new Font("Lucida Grande", 0, 20));
/* 117 */     textPane_year.setEditable(false);
/* 118 */     textPane_year.setBounds(181, 94, 71, 45);
/* 119 */     this.contentPane.add(textPane_year);
/* 120 */     textPane_year.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(8, 8, 8, 8)));
/* 121 */     StyledDocument doc5 = textPane_year.getStyledDocument();
/* 122 */     SimpleAttributeSet center5 = new SimpleAttributeSet();
/* 123 */     StyleConstants.setAlignment(center5, 1);
/* 124 */     doc5.setParagraphAttributes(0, doc5.getLength(), center5, false);
/*     */     
/* 126 */     JTextPane textPane_week = new JTextPane();
/* 127 */     textPane_week.setFont(new Font("Lucida Grande", 0, 18));
/* 128 */     textPane_week.setEditable(false);
/* 129 */     textPane_week.setBounds(40, 94, 142, 45);
/* 130 */     this.contentPane.add(textPane_week);
/* 131 */     textPane_week.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(8, 8, 8, 8)));
/*     */     
/* 133 */     StyledDocument doc3 = textPane_week.getStyledDocument();
/* 134 */     SimpleAttributeSet center3 = new SimpleAttributeSet();
/* 135 */     StyleConstants.setAlignment(center3, 1);
/* 136 */     doc3.setParagraphAttributes(0, doc3.getLength(), center3, false);
/* 137 */     displayWeekAndYear(textPane_year, textPane_week);
/*     */     
/* 139 */     JTextPane textPane_firstName = new JTextPane();
/* 140 */     textPane_firstName.setEditable(false);
/* 141 */     textPane_firstName.setBounds(40, 32, 212, 32);
/* 142 */     this.contentPane.add(textPane_firstName);
/* 143 */     textPane_firstName.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(8, 8, 8, 8)));
/* 144 */     StyledDocument doc = textPane_firstName.getStyledDocument();
/* 145 */     SimpleAttributeSet center = new SimpleAttributeSet();
/* 146 */     StyleConstants.setAlignment(center, 1);
/* 147 */     doc.setParagraphAttributes(0, doc.getLength(), center, false);
/* 148 */     textPane_firstName.setText(Main.p.getFirstName());
/*     */     
/* 150 */     JTextPane textPane_lastName = new JTextPane();
/* 151 */     textPane_lastName.setEditable(false);
/* 152 */     textPane_lastName.setBounds(40, 63, 212, 32);
/* 153 */     this.contentPane.add(textPane_lastName);
/* 154 */     textPane_lastName.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(8, 8, 8, 8)));
/* 155 */     StyledDocument doc2 = textPane_lastName.getStyledDocument();
/* 156 */     SimpleAttributeSet center2 = new SimpleAttributeSet();
/* 157 */     StyleConstants.setAlignment(center2, 1);
/* 158 */     doc2.setParagraphAttributes(0, doc2.getLength(), center2, false);
/* 159 */     textPane_lastName.setText(Main.p.getLastName());
/*     */     
/* 161 */     JTextArea textPane_advice = new JTextArea();
/* 162 */     textPane_advice.setFont(new Font("Lucida Grande", 0, 12));
/* 163 */     textPane_advice.setEditable(false);
/* 164 */     textPane_advice.setBounds(796, 49, 202, 173);
/* 165 */     this.contentPane.add(textPane_advice);
/* 166 */     textPane_advice.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(8, 8, 8, 8)));
/* 167 */     StyledDocument doc4 = textPane_week.getStyledDocument();
/* 168 */     SimpleAttributeSet center4 = new SimpleAttributeSet();
/* 169 */     StyleConstants.setAlignment(center4, 1);
/* 170 */     doc4.setParagraphAttributes(0, doc4.getLength(), center4, false);
/* 171 */     textPane_advice.setLineWrap(true);
/* 172 */     textPane_advice.setWrapStyleWord(true);
/*     */     
/* 174 */     Random rand = new Random();
/* 175 */     int n = rand.nextInt(30) + 1;
/*     */     
/* 177 */     if (n == 1) { textPane_advice.setText("If you have family/friends in college, ask them for access to their account to access research.\n- angelayin22449"); }
/*     */     
/* 179 */     else if (n == 2) { textPane_advice.setText("Music prevents drowsiness or boredom when doing homework.\n- angelayin22449"); }
/*     */     
/* 181 */     else if (n == 3) { textPane_advice.setText("Be a part of/create a community where you can share and help your fellow classmates. Share notes, past papers, tips, videos, websites.\n- 19lexi.lu"); }
/*     */     
/* 183 */     else if (n == 4) { textPane_advice.setText("Don't sleep late; wake up early.\n- Saeedeh.shafaeeahmad"); }
/* 184 */     else if (n == 5) { textPane_advice.setText("Try finishing your CAS in the first year so that you have more time to revise for the finals.\n - Anonymous"); }
/* 185 */     else if (n == 6) { textPane_advice.setText("If you are into flash cards, start making them from the very first day because they really do pile up on you.  \n- Anonymous"); }
/* 186 */     else if (n == 7) { textPane_advice.setText("Noting topics should be done on the day of the class, rewritten within a week after the class, and before any tests/exams based on that information. \n - Anonymous"); }
/* 187 */     else if (n == 8) { textPane_advice.setText("Baking is a nice relaxing activity for many people, and you can use the food you make as motivation to keep studying ('One more page of notes and I can eat another cookie!'). \n- Anonymous "); }
/* 188 */     else if (n == 9) { textPane_advice.setText("Meditation is good for when you're overwhelmed, which happened a lot to me when working on essays. \n- Anonymous"); }
/* 189 */     else if (n == 10) { textPane_advice.setText("TIME, TIME, TIME! Don’t take it for granted, EVER! Try to get used to work patterns, have a good habit of both sleeping early and balancing exercise with academics.\n- advitsoni"); }
/* 190 */     else if (n == 11) { textPane_advice.setText("All syllabus are found easily online including pre-exam papers. However do note that exam papers tend to change a lot in a matter of years.\n- advitsoni"); }
/* 191 */     else if (n == 12) { textPane_advice.setText("The IB Reddit is your friend. \n- marcuscheung0316"); }
/* 192 */     else if (n == 13) { textPane_advice.setText("Start planning for the EE at the start of your first year.\n- marcuscheung0316"); }
/* 193 */     else if (n == 14) { textPane_advice.setText("Try to familiarise your self with IA and EE rubrics and make sure your work matches the descriptions in the rubric.\n- marcuscheung0316"); }
/* 194 */     else if (n == 15) { textPane_advice.setText("All nighters are not worth it, it ruins your sleep routine and you will not be able to preform well the day after.\n- Lotteliseevensen"); }
/* 195 */     else if (n == 16) { textPane_advice.setText("A lot of stress will weaken your immune system and will can lead to you being sick, so just take care of yourself.\n- Lotteliseevensen"); }
/* 196 */     else if (n == 17) { textPane_advice.setText("Biology HL - always review BioNinija if you're stuck with some content - it's a really good website. Oxford textbook is great.\n- Lotteliseevensen"); }
/* 197 */     else if (n == 18) { textPane_advice.setText("Don't wait till the end of the topic because you'll just be more and more confused as they teach more content. Revise early, make sure you understand everything.\n- Anonymous"); }
/* 198 */     else if (n == 19) { textPane_advice.setText("Watch movies in the language you’re taking to gain situational context for phrases.\n- Anonymous"); }
/* 199 */     else if (n == 20) { textPane_advice.setText("Life balance: don't forget to have a social life.\n- Anonymous"); }
/* 200 */     else if (n == 21) { textPane_advice.setText("Study units in advance. This means that when you learn it in class you will already understand the gist of it and can move more easily through the questions and help explaining it to others.\n- vfethke"); }
/* 201 */     else if (n == 22) { textPane_advice.setText("If possible, Ask teachers to make CUMULATIVE unit tests. This is very helpful for long-term retention.\n- vfethke"); }
/* 202 */     else if (n == 23) { textPane_advice.setText("Don't plagiarize. Even if you don't get caught by your teachers, you will constantly live in fear of getting caught by the actual IB graders.\n- Anonymous"); }
/* 203 */     else if (n == 24) { textPane_advice.setText("Don't neglect CAS, TOK or the EE but at the same time don't over stress yourself with them. They are all good learning opportunities, so you shouldn't ignore them but don't prioritise them over your main subjects.\n- Anonymous"); }
/* 204 */     else if (n == 25) { textPane_advice.setText("Do not learn textbooks by heart, try to understand what you're reading because you learned you won't be able to explain it using your own words later on.\n- anilorakkaro"); }
/* 205 */     else if (n == 26) { textPane_advice.setText("Sleep is important, really really important. You will be able to learn well only when you are well rested. Always put your health first.\n- Anonymous"); }
/* 206 */     else if (n == 27) { textPane_advice.setText("DO NOT PROCASTINATE. That is easier if you divide a task into a few smaller ones and schedule when you will do them.\n- Anonymous"); }
/* 207 */     else if (n == 28) { textPane_advice.setText("Use CAS as an opportunity to take a short break from studying in order to stay productive in the long term. \n- daisyblijdorp"); }
/* 208 */     else if (n == 29) { textPane_advice.setText("Plan out your IAs as early as possible. Also, it's okay to ask Y2 or IB alumni for help once in a while (just don't plagirize).\n- YSEO"); }
/* 209 */     else if (n == 30) { textPane_advice.setText("Utilizing Winter/Summer breaks well is crucial for an easier IB Y2 life. Everything from college apps, internships/seasonal camps, and IB revision (IA re-edits, EE edits, CAS catch-ups) can be done during your time off from regular classes.\n- YSEO"); }
/*     */ 
/*     */ 
/*     */     
/* 213 */     JTextPane textPane_stats = new JTextPane();
/* 214 */     textPane_stats.setFont(new Font("Lucida Grande", 0, 12));
/* 215 */     textPane_stats.setEditable(false);
/* 216 */     textPane_stats.setBounds(40, 166, 212, 318);
/* 217 */     this.contentPane.add(textPane_stats);
/* 218 */     textPane_stats.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(8, 8, 8, 8)));
/* 219 */     System.out.println("Stress: " + Main.p.getStress());
/* 220 */     System.out.println("StressLim: " + Main.p.getStressLimit());
/* 221 */     double stressPercent = Main.p.getStress() / Main.p.getStressLimit() * 100.0D;
/* 222 */     System.out.println("StressPercent: " + stressPercent);
/* 223 */     stressPercent *= 100.0D;
/* 224 */     stressPercent = Math.round(stressPercent);
/* 225 */     stressPercent /= 100.0D;
/*     */     
/* 227 */     String t = "";
/* 228 */     if (Main.p.getCas() > 9) {
/* 229 */       t = "Stress (%): " + stressPercent + " % \n\n" + 
/* 230 */         "Social: " + Main.p.getSocial() + "\n\n" + 
/* 231 */         "CAS: full\n\n" + 
/* 232 */         Main.p.getG1_subject()[0] + " " + Main.p.getG1_subject()[1] + ": " + Main.p.getG1_score() + "\n\n" + 
/* 233 */         Main.p.getG2_subject()[0] + " " + Main.p.getG2_subject()[1] + ": " + Main.p.getG2_score() + "\n\n" + 
/* 234 */         Main.p.getG3_subject()[0] + " " + Main.p.getG3_subject()[1] + ": " + Main.p.getG3_score() + "\n\n" + 
/* 235 */         Main.p.getG4_subject()[0] + " " + Main.p.getG4_subject()[1] + ": " + Main.p.getG4_score() + "\n\n" + 
/* 236 */         Main.p.getG5_subject()[0] + " " + Main.p.getG5_subject()[1] + ": " + Main.p.getG5_score() + "\n\n" + 
/* 237 */         Main.p.getG6_subject()[0] + " " + Main.p.getG6_subject()[1] + ": " + Main.p.getG6_score();
/*     */     } else {
/*     */       
/* 240 */       t = "Stress (%): " + stressPercent + " % \n\n" + 
/* 241 */         "Social: " + Main.p.getSocial() + "\n\n" + 
/* 242 */         "CAS: " + Main.p.getCas() + "\n\n" + 
/* 243 */         Main.p.getG1_subject()[0] + " " + Main.p.getG1_subject()[1] + ": " + Main.p.getG1_score() + "\n\n" + 
/* 244 */         Main.p.getG2_subject()[0] + " " + Main.p.getG2_subject()[1] + ": " + Main.p.getG2_score() + "\n\n" + 
/* 245 */         Main.p.getG3_subject()[0] + " " + Main.p.getG3_subject()[1] + ": " + Main.p.getG3_score() + "\n\n" + 
/* 246 */         Main.p.getG4_subject()[0] + " " + Main.p.getG4_subject()[1] + ": " + Main.p.getG4_score() + "\n\n" + 
/* 247 */         Main.p.getG5_subject()[0] + " " + Main.p.getG5_subject()[1] + ": " + Main.p.getG5_score() + "\n\n" + 
/* 248 */         Main.p.getG6_subject()[0] + " " + Main.p.getG6_subject()[1] + ": " + Main.p.getG6_score();
/*     */     } 
/*     */     
/* 251 */     textPane_stats.setText(t);
/*     */     
/* 253 */     JButton btnSchedule = new JButton("S C H E D U L E");
/* 254 */     btnSchedule.setBounds(795, 297, 202, 40);
/* 255 */     this.contentPane.add(btnSchedule);
/* 256 */     btnSchedule.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 258 */             Home.this.dispose();
/*     */             
/* 260 */             Schedule s = new Schedule();
/* 261 */             s.setVisible(true);
/*     */           }
/*     */         });
/*     */     
/* 265 */     JButton btnComputer = new JButton("C O M P U T E R");
/* 266 */     btnComputer.setBounds(796, 401, 201, 40);
/* 267 */     this.contentPane.add(btnComputer);
/* 268 */     btnComputer.addActionListener(new ActionListener()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e) {
/* 271 */             System.out.println("computer button clicked");
/* 272 */             Object[] options = { "My Status", "Email Counselor" };
/* 273 */             int choice = JOptionPane.showOptionDialog(null, "Your computer bleeps twice. You're logged in!\n\n[Welcome, " + Main.p.getFirstName() + "]", "BLEEP BLEEP!", -1, -1, null, options, Integer.valueOf(1));
/*     */             
/* 275 */             if (choice == 0) {
/* 276 */               if (Main.p.isSick()) {
/* 277 */                 JOptionPane.showMessageDialog(null, "You are sick! It's probably because of stress. Find ways to decrease your stress below\n your stress limit or else you will have severe penalties in your learning speed!", "Diagnosis", 2);
/*     */               }
/* 279 */               else if (Main.p.getStress() > Main.p.getStressLimit() * 0.9D) {
/* 280 */                 JOptionPane.showMessageDialog(null, "Hey, are you alright? You should probably rest a bit before studying.", "Diagnosis", 2);
/*     */               }
/* 282 */               else if (Main.p.getStress() > Main.p.getStressLimit() * 0.8D) {
/* 283 */                 JOptionPane.showMessageDialog(null, "You seem pretty stressed out. How 'bout a little nap before you do anything too strenuous?", "Diagnosis", 2);
/*     */               }
/* 285 */               else if (Main.p.getStress() > Main.p.getStressLimit() * 0.5D) {
/* 286 */                 JOptionPane.showMessageDialog(null, "You might want to take a little break!", "Diagnosis", 2);
/*     */               } else {
/*     */                 
/* 289 */                 JOptionPane.showMessageDialog(null, "You seem very healthy!", "Diagnosis", 1);
/*     */               } 
/*     */               
/*     */               return;
/*     */             } 
/* 294 */             if (choice == 1) {
/*     */               
/* 296 */               if (Main.p.getQoa() > 500) {
/* 297 */                 JOptionPane.showMessageDialog(null, "I mean, we never know... but it seems very likely that your dream\nschool with accept you! Just focus on your final IB scores.", "Counselor", -1);
/*     */               }
/* 299 */               else if (Main.p.getQoa() > 350) {
/* 300 */                 JOptionPane.showMessageDialog(null, "I mean, we never know... but it's pretty likely that you'll be\naccepted into one of your reach schools!", "Counselor", -1);
/*     */               }
/* 302 */               else if (Main.p.getQoa() > 200) {
/* 303 */                 JOptionPane.showMessageDialog(null, "As long as you keep on what you're doing, it's pretty likely that\nyou'll be accepted into one of your match schools!", "Counselor", -1);
/*     */               } else {
/*     */                 
/* 306 */                 JOptionPane.showMessageDialog(null, "I mean, you'll probably get into at least one of your safety schools.", "Counselor", -1);
/*     */               } 
/*     */ 
/*     */               
/*     */               return;
/*     */             } 
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 316 */     JButton btnSave = new JButton("S A V E");
/* 317 */     btnSave.setBounds(796, 453, 201, 40);
/* 318 */     this.contentPane.add(btnSave);
/* 319 */     btnSave.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 321 */             int result = JOptionPane.showConfirmDialog(null, "Overwrite previous save file?", "", 0);
/* 322 */             if (result == 0) {
/* 323 */               Main.savePlayerToFile();
/* 324 */               JOptionPane.showMessageDialog(null, "Done!", "", 1);
/*     */             } 
/*     */           }
/*     */         });
/*     */ 
/*     */ 
/*     */     
/* 331 */     JButton btnLoad = new JButton("L O A D");
/* 332 */     btnLoad.setBounds(796, 505, 201, 40);
/* 333 */     this.contentPane.add(btnLoad);
/* 334 */     btnLoad.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 336 */             int result = JOptionPane.showConfirmDialog(null, "Load previous file?", "", 0);
/* 337 */             if (result == 0) {
/* 338 */               Main.readPlayerFromFile();
/* 339 */               Home.this.dispose();
/* 340 */               Home h = new Home();
/* 341 */               h.setVisible(true);
/*     */             } 
/*     */           }
/*     */         });
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 349 */     JButton btnEffort = new JButton("E F F O R T");
/* 350 */     btnEffort.setBounds(796, 349, 200, 40);
/* 351 */     this.contentPane.add(btnEffort);
/* 352 */     btnEffort.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 354 */             Object[] options = { "Take It Easy", "Normal Effort", "Great Effort", "Stay Up" };
/*     */             
/* 356 */             String t = "";
/*     */             
/* 358 */             if (Main.p.getEffort() == 0) {
/* 359 */               t = "You are taking it easy.\n\nIntel Gained = 5\nStress Gained = 3";
/*     */             }
/* 361 */             else if (Main.p.getEffort() == 1) {
/* 362 */               t = "You are putting in normal effort.\n\nIntel Gained = 10\nStress Gained = 8";
/*     */             }
/* 364 */             else if (Main.p.getEffort() == 2) {
/* 365 */               t = "You are putting in great effort.\n\nIntel Gained = 15\nStress Gained = 15";
/*     */             }
/* 367 */             else if (Main.p.getEffort() == 3) {
/* 368 */               t = "You are staying up at night.\n\nIntel Gained = 20\nStress Gained = 25";
/*     */             } 
/* 370 */             int choice = JOptionPane.showOptionDialog(null, t, "E F F O R T", -1, -1, null, options, null);
/*     */             
/* 372 */             if (choice == 0) {
/* 373 */               Main.p.setEffort(0);
/* 374 */               Main.p.setIntelGain(5);
/* 375 */               Main.p.setStressGain(3);
/*     */             }
/* 377 */             else if (choice == 1) {
/* 378 */               Main.p.setEffort(1);
/* 379 */               Main.p.setIntelGain(10);
/* 380 */               Main.p.setStressGain(8);
/*     */             }
/* 382 */             else if (choice == 2) {
/* 383 */               Main.p.setEffort(2);
/* 384 */               Main.p.setIntelGain(15);
/* 385 */               Main.p.setStressGain(15);
/*     */             }
/* 387 */             else if (choice == 3) {
/* 388 */               Main.p.setEffort(3);
/* 389 */               Main.p.setIntelGain(20);
/* 390 */               Main.p.setStressGain(25);
/*     */             } 
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 396 */     JLabel lblNewLabel = new JLabel("IB TIPS & TRICKS (from actual alumni)");
/* 397 */     lblNewLabel.setFont(new Font("Lucida Grande", 0, 11));
/* 398 */     lblNewLabel.setBounds(796, 18, 202, 32);
/* 399 */     this.contentPane.add(lblNewLabel);
/*     */     
/* 401 */     JButton btnMainMenu = new JButton("← M A I N  M E N U");
/* 402 */     btnMainMenu.setBounds(40, 505, 212, 40);
/* 403 */     this.contentPane.add(btnMainMenu);
/* 404 */     btnMainMenu.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 406 */             Home.this.dispose();
/* 407 */             Main m = new Main();
/* 408 */             m.setVisible(true);
/*     */           }
/*     */         });
/*     */     
/* 412 */     JLabel lblChar = new JLabel("");
/* 413 */     lblChar.setBounds(368, 85, 327, 493);
/* 414 */     this.contentPane.add(lblChar);
/*     */     
/* 416 */     if (Main.p.getGender().equalsIgnoreCase("F")) {
/* 417 */       if (stressPercent > 20.0D) url = Main.class.getResource("/f_knee_2.jpg"); 
/* 418 */       if (stressPercent > 50.0D) url = Main.class.getResource("/f_knee_5.jpg"); 
/* 419 */       if (stressPercent > 80.0D) { url = Main.class.getResource("/f_knee_8.jpg"); }
/* 420 */       else { url = Main.class.getResource("/f_knee.jpg"); }
/*     */     
/*     */     } else {
/* 423 */       if (stressPercent > 20.0D) url = Main.class.getResource("/m_knee_2.jpg"); 
/* 424 */       if (stressPercent > 50.0D) url = Main.class.getResource("/m_knee_5.jpg"); 
/* 425 */       if (stressPercent > 80.0D) { url = Main.class.getResource("/m_knee_8.jpg"); }
/* 426 */       else { url = Main.class.getResource("/m_knee.jpg"); }
/*     */     
/* 428 */     }  lblChar.setIcon(new ImageIcon(url));
/*     */     
/* 430 */     URL url2 = Main.class.getResource("/home.jpg");
/* 431 */     JLabel lblBg = new JLabel("");
/* 432 */     lblBg.setHorizontalAlignment(0);
/* 433 */     lblBg.setBounds(0, 0, 1050, 600);
/* 434 */     this.contentPane.add(lblBg);
/* 435 */     lblBg.setIcon(new ImageIcon(url2));
/*     */   }
/*     */   String[] options;
/*     */   boolean dispose;
/*     */   
/*     */   public void displayWeekAndYear(JTextPane textPane_year, JTextPane textPane_week) {
/* 441 */     if (Main.p.getYear() == 1) {
/* 442 */       textPane_year.setText("IB Y1");
/*     */     }
/* 444 */     else if (Main.p.getYear() == 2) {
/* 445 */       textPane_year.setText("IB Y2");
/*     */     } 
/*     */     
/* 448 */     if (Main.p.getWeek() == 1) {
/* 449 */       textPane_week.setText("Week 1 & 2");
/*     */     }
/* 451 */     else if (Main.p.getWeek() == 2) {
/* 452 */       textPane_week.setText("Week 3 & 4");
/*     */     }
/* 454 */     else if (Main.p.getWeek() == 3) {
/* 455 */       textPane_week.setText("Week 5 & 6");
/*     */     }
/* 457 */     else if (Main.p.getWeek() == 4) {
/* 458 */       textPane_week.setText("Week 7 & 8");
/*     */     }
/* 460 */     else if (Main.p.getWeek() == 5) {
/* 461 */       textPane_week.setText("Week 9 & 10");
/*     */     }
/* 463 */     else if (Main.p.getWeek() == 6) {
/* 464 */       textPane_week.setText("Week 11 & 12");
/*     */     }
/* 466 */     else if (Main.p.getWeek() == 7) {
/* 467 */       textPane_week.setText("Week 13 & 14");
/*     */     }
/* 469 */     else if (Main.p.getWeek() == 8) {
/* 470 */       textPane_week.setText("Week 15 - 27");
/*     */     }
/* 472 */     else if (Main.p.getWeek() == 9) {
/* 473 */       textPane_week.setText("Week 28 & 29");
/*     */     }
/* 475 */     else if (Main.p.getWeek() == 10) {
/* 476 */       textPane_week.setText("Week 30 & 31");
/*     */     }
/* 478 */     else if (Main.p.getWeek() == 11) {
/* 479 */       textPane_week.setText("Week 32 & 33");
/*     */     }
/* 481 */     else if (Main.p.getWeek() == 12) {
/* 482 */       textPane_week.setText("Week 34 & 35");
/*     */     }
/* 484 */     else if (Main.p.getWeek() == 13) {
/* 485 */       textPane_week.setText("Week 36 & 37");
/*     */     }
/* 487 */     else if (Main.p.getWeek() == 14) {
/* 488 */       textPane_week.setText("Week 38 & 39");
/*     */     }
/* 490 */     else if (Main.p.getWeek() == 15) {
/* 491 */       textPane_week.setText("Week 40 & 41");
/*     */     }
/* 493 */     else if (Main.p.getWeek() == 16) {
/* 494 */       textPane_week.setText("Week 42 - 56");
/*     */     }
/* 496 */     else if (Main.p.getWeek() == 17) {
/* 497 */       textPane_week.setText("Week 57 & 58");
/* 498 */       Main.p.setYear(2);
/*     */     }
/* 500 */     else if (Main.p.getWeek() == 18) {
/* 501 */       textPane_week.setText("Week 59 & 60");
/*     */     }
/* 503 */     else if (Main.p.getWeek() == 19) {
/* 504 */       textPane_week.setText("Week 61 & 62");
/*     */     }
/* 506 */     else if (Main.p.getWeek() == 20) {
/* 507 */       textPane_week.setText("Week 63 & 64");
/*     */     }
/* 509 */     else if (Main.p.getWeek() == 21) {
/* 510 */       textPane_week.setText("Week 65 & 66");
/*     */     }
/* 512 */     else if (Main.p.getWeek() == 22) {
/* 513 */       textPane_week.setText("Week 67 & 68");
/*     */     }
/* 515 */     else if (Main.p.getWeek() == 23) {
/* 516 */       textPane_week.setText("Week 69 & 70");
/*     */     }
/* 518 */     else if (Main.p.getWeek() == 24) {
/* 519 */       textPane_week.setText("Week 71 - 79");
/*     */     }
/* 521 */     else if (Main.p.getWeek() == 25) {
/* 522 */       textPane_week.setText("Week 80 & 81");
/*     */     }
/* 524 */     else if (Main.p.getWeek() == 26) {
/* 525 */       textPane_week.setText("Week 82 & 83");
/*     */     }
/* 527 */     else if (Main.p.getWeek() == 27) {
/* 528 */       textPane_week.setText("Week 84 & 85");
/*     */     }
/* 530 */     else if (Main.p.getWeek() == 28) {
/* 531 */       textPane_week.setText("Week 86 & 87");
/*     */     }
/* 533 */     else if (Main.p.getWeek() == 29) {
/* 534 */       textPane_week.setText("Week 88 & 89");
/*     */     }
/* 536 */     else if (Main.p.getWeek() == 30) {
/* 537 */       textPane_week.setText("Week 90 - 92");
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\82109\Downloads\survIB (v0.1.1).jar!\gui\Home.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */