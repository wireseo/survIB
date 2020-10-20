/*     */ package non_gui;public class Player implements Serializable { private String gender;
/*     */   private String firstName;
/*     */   private String lastName;
/*     */   private String[] g1_subject;
/*     */   private String[] g2_subject;
/*     */   private String[] g3_subject;
/*     */   private String[] g4_subject;
/*     */   private String[] g5_subject;
/*     */   private String[] g6_subject;
/*     */   
/*     */   public Player() {
/*  12 */     this.usedComputer = false;
/*  13 */     this.injured = false;
/*  14 */     this.cas = 0;
/*     */   }
/*     */   private String arts; private String service; private String sports; private boolean usedComputer; private int year; private int week; private int[] weekSchedule; private int stress; private int stressLimit; private boolean sick; private boolean injured; private int social; private int qoa; private int intelGain;
/*     */   private int stressGain;
/*     */   private int effort;
/*     */   private int g1_score;
/*     */   private int g2_score;
/*     */   private int g3_score;
/*     */   private int g4_score;
/*     */   private int g5_score;
/*     */   private int g6_score;
/*     */   private int arts_score;
/*     */   private int tok;
/*     */   private int ee;
/*     */   private int cas;
/*     */   private boolean malpractice;
/*     */   private int finalIBScore;
/*     */   private String uni;
/*     */   private String major;
/*     */   
/*     */   public Player(String gender, String firstName, String lastName, String[] g1_subject, String[] g2_subject, String[] g3_subject, String[] g4_subject, String[] g5_subject, String[] g6_subject, String arts, String service, String sports) {
/*  35 */     this.gender = gender;
/*  36 */     this.firstName = firstName;
/*  37 */     this.lastName = lastName;
/*  38 */     this.g1_subject = g1_subject;
/*  39 */     this.g2_subject = g2_subject;
/*  40 */     this.g3_subject = g3_subject;
/*  41 */     this.g4_subject = g4_subject;
/*  42 */     this.g5_subject = g5_subject;
/*  43 */     this.g6_subject = g6_subject;
/*  44 */     this.arts = arts;
/*  45 */     this.service = service;
/*  46 */     this.sports = sports;
/*  47 */     this.usedComputer = false;
/*  48 */     this.injured = false;
/*  49 */     this.cas = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Player(String gender, String firstName, String lastName, String[] g1_subject, String[] g2_subject, String[] g3_subject, String[] g4_subject, String[] g5_subject, String[] g6_subject, String arts, String service, String sports, int year, int week, int[] weekSchedule, int stress, int stressLimit, boolean sick, int social, int qoa, int intelGain, int stressGain, int effort, int g1_score, int g2_score, int g3_score, int g4_score, int g5_score, int g6_score, int arts_score, int tok, int ee, boolean malpractice, int finalIBScore, String uni, String major) {
/*  96 */     this.gender = gender;
/*  97 */     this.firstName = firstName;
/*  98 */     this.lastName = lastName;
/*  99 */     this.g1_subject = g1_subject;
/* 100 */     this.g2_subject = g2_subject;
/* 101 */     this.g3_subject = g3_subject;
/* 102 */     this.g4_subject = g4_subject;
/* 103 */     this.g5_subject = g5_subject;
/* 104 */     this.g6_subject = g6_subject;
/* 105 */     this.arts = arts;
/* 106 */     this.service = service;
/* 107 */     this.sports = sports;
/* 108 */     this.year = year;
/* 109 */     this.week = week;
/* 110 */     this.weekSchedule = weekSchedule;
/* 111 */     this.stress = stress;
/* 112 */     this.stressLimit = stressLimit;
/* 113 */     this.sick = sick;
/* 114 */     this.social = social;
/* 115 */     this.qoa = qoa;
/* 116 */     this.intelGain = intelGain;
/* 117 */     this.stressGain = stressGain;
/* 118 */     this.effort = effort;
/* 119 */     this.g1_score = g1_score;
/* 120 */     this.g2_score = g2_score;
/* 121 */     this.g3_score = g3_score;
/* 122 */     this.g4_score = g4_score;
/* 123 */     this.g5_score = g5_score;
/* 124 */     this.g6_score = g6_score;
/* 125 */     this.arts_score = arts_score;
/* 126 */     this.tok = tok;
/* 127 */     this.ee = ee;
/* 128 */     this.malpractice = malpractice;
/* 129 */     this.finalIBScore = finalIBScore;
/* 130 */     this.uni = uni;
/* 131 */     this.major = major;
/* 132 */     this.usedComputer = false;
/* 133 */     this.injured = false;
/* 134 */     this.cas = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGender() {
/* 201 */     return this.gender;
/*     */   }
/*     */   public String getFirstName() {
/* 204 */     return this.firstName;
/*     */   }
/*     */   public String getLastName() {
/* 207 */     return this.lastName;
/*     */   }
/*     */   public String[] getG1_subject() {
/* 210 */     return this.g1_subject;
/*     */   }
/*     */   public String[] getG2_subject() {
/* 213 */     return this.g2_subject;
/*     */   }
/*     */   public String[] getG3_subject() {
/* 216 */     return this.g3_subject;
/*     */   }
/*     */   public String[] getG4_subject() {
/* 219 */     return this.g4_subject;
/*     */   }
/*     */   public String[] getG5_subject() {
/* 222 */     return this.g5_subject;
/*     */   }
/*     */   public String[] getG6_subject() {
/* 225 */     return this.g6_subject;
/*     */   }
/*     */   public String getArts() {
/* 228 */     return this.arts;
/*     */   }
/*     */   public String getService() {
/* 231 */     return this.service;
/*     */   }
/*     */   public String getSports() {
/* 234 */     return this.sports;
/*     */   }
/*     */   public int getYear() {
/* 237 */     return this.year;
/*     */   }
/*     */   public int getWeek() {
/* 240 */     return this.week;
/*     */   }
/*     */   public int[] getWeekSchedule() {
/* 243 */     return this.weekSchedule;
/*     */   }
/*     */   public int getStress() {
/* 246 */     return this.stress;
/*     */   }
/*     */   public int getStressLimit() {
/* 249 */     return this.stressLimit;
/*     */   }
/*     */   public boolean isSick() {
/* 252 */     return this.sick;
/*     */   }
/*     */   public int getSocial() {
/* 255 */     return this.social;
/*     */   }
/*     */   public int getQoa() {
/* 258 */     return this.qoa;
/*     */   }
/*     */   public int getIntelGain() {
/* 261 */     return this.intelGain;
/*     */   }
/*     */   public int getStressGain() {
/* 264 */     return this.stressGain;
/*     */   }
/*     */   public int getEffort() {
/* 267 */     return this.effort;
/*     */   }
/*     */   public int getG1_score() {
/* 270 */     return this.g1_score;
/*     */   }
/*     */   public int getG2_score() {
/* 273 */     return this.g2_score;
/*     */   }
/*     */   public int getG3_score() {
/* 276 */     return this.g3_score;
/*     */   }
/*     */   public int getG4_score() {
/* 279 */     return this.g4_score;
/*     */   }
/*     */   public int getG5_score() {
/* 282 */     return this.g5_score;
/*     */   }
/*     */   public int getG6_score() {
/* 285 */     return this.g6_score;
/*     */   }
/*     */   public int getArts_score() {
/* 288 */     return this.arts_score;
/*     */   }
/*     */   public int getTok() {
/* 291 */     return this.tok;
/*     */   }
/*     */   public int getEe() {
/* 294 */     return this.ee;
/*     */   }
/*     */   public boolean isMalpractice() {
/* 297 */     return this.malpractice;
/*     */   }
/*     */   public int getFinalIBScore() {
/* 300 */     return this.finalIBScore;
/*     */   }
/*     */   public String getUni() {
/* 303 */     return this.uni;
/*     */   }
/*     */   public String getMajor() {
/* 306 */     return this.major;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGender(String gender) {
/* 313 */     this.gender = gender;
/*     */   }
/*     */   public void setFirstName(String firstName) {
/* 316 */     this.firstName = firstName;
/*     */   }
/*     */   public void setLastName(String lastName) {
/* 319 */     this.lastName = lastName;
/*     */   }
/*     */   public void setG1_subject(String[] g1_subject) {
/* 322 */     this.g1_subject = g1_subject;
/*     */   }
/*     */   public void setG2_subject(String[] g2_subject) {
/* 325 */     this.g2_subject = g2_subject;
/*     */   }
/*     */   public void setG3_subject(String[] g3_subject) {
/* 328 */     this.g3_subject = g3_subject;
/*     */   }
/*     */   public void setG4_subject(String[] g4_subject) {
/* 331 */     this.g4_subject = g4_subject;
/*     */   }
/*     */   public void setG5_subject(String[] g5_subject) {
/* 334 */     this.g5_subject = g5_subject;
/*     */   }
/*     */   public void setG6_subject(String[] g6_subject) {
/* 337 */     this.g6_subject = g6_subject;
/*     */   }
/*     */   public void setArts(String arts) {
/* 340 */     this.arts = arts;
/*     */   }
/*     */   public void setService(String service) {
/* 343 */     this.service = service;
/*     */   }
/*     */   public void setSports(String sports) {
/* 346 */     this.sports = sports;
/*     */   }
/*     */   public void setYear(int year) {
/* 349 */     this.year = year;
/*     */   }
/*     */   public void setWeek(int week) {
/* 352 */     this.week = week;
/*     */   }
/*     */   public void setWeekSchedule(int[] weekSchedule) {
/* 355 */     this.weekSchedule = weekSchedule;
/*     */   }
/*     */   public void setStress(int stress) {
/* 358 */     this.stress = stress;
/*     */   }
/*     */   public void setStressLimit(int stressLimit) {
/* 361 */     this.stressLimit = stressLimit;
/*     */   }
/*     */   public void setSick(boolean sick) {
/* 364 */     this.sick = sick;
/*     */   }
/*     */   public void setSocial(int social) {
/* 367 */     this.social = social;
/*     */   }
/*     */   public void setQoa(int qoa) {
/* 370 */     this.qoa = qoa;
/*     */   }
/*     */   public void setIntelGain(int intelGain) {
/* 373 */     this.intelGain = intelGain;
/*     */   }
/*     */   public void setStressGain(int stressGain) {
/* 376 */     this.stressGain = stressGain;
/*     */   }
/*     */   public void setEffort(int effort) {
/* 379 */     this.effort = effort;
/*     */   }
/*     */   public void setG1_score(int g1_score) {
/* 382 */     this.g1_score = g1_score;
/*     */   }
/*     */   public void setG2_score(int g2_score) {
/* 385 */     this.g2_score = g2_score;
/*     */   }
/*     */   public void setG3_score(int g3_score) {
/* 388 */     this.g3_score = g3_score;
/*     */   }
/*     */   public void setG4_score(int g4_score) {
/* 391 */     this.g4_score = g4_score;
/*     */   }
/*     */   public void setG5_score(int g5_score) {
/* 394 */     this.g5_score = g5_score;
/*     */   }
/*     */   public void setG6_score(int g6_score) {
/* 397 */     this.g6_score = g6_score;
/*     */   }
/*     */   public void setArts_score(int arts_score) {
/* 400 */     this.arts_score = arts_score;
/*     */   }
/*     */   public void setTok(int tok) {
/* 403 */     this.tok = tok;
/*     */   }
/*     */   public void setEe(int ee) {
/* 406 */     this.ee = ee;
/*     */   }
/*     */   public void setMalpractice(boolean malpractice) {
/* 409 */     this.malpractice = malpractice;
/*     */   }
/*     */   public void setFinalIBScore(int finalIBScore) {
/* 412 */     this.finalIBScore = finalIBScore;
/*     */   }
/*     */   public void setUni(String uni) {
/* 415 */     this.uni = uni;
/*     */   }
/*     */   public void setMajor(String major) {
/* 418 */     this.major = major;
/*     */   }
/*     */   
/*     */   public boolean isUsedComputer() {
/* 422 */     return this.usedComputer;
/*     */   }
/*     */   
/*     */   public void setUsedComputer(boolean usedComputer) {
/* 426 */     this.usedComputer = usedComputer;
/*     */   }
/*     */   
/*     */   public boolean isInjured() {
/* 430 */     return this.injured;
/*     */   }
/*     */   
/*     */   public void setInjured(boolean injured) {
/* 434 */     this.injured = injured;
/*     */   }
/*     */   
/*     */   public int getCas() {
/* 438 */     return this.cas;
/*     */   }
/*     */   
/*     */   public void setCas(int cas) {
/* 442 */     this.cas = cas;
/*     */   } }


/* Location:              C:\Users\82109\Downloads\survIB (v0.1.1).jar!\non_gui\Player.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */