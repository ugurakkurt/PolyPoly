public class QuestionsInfo {
        protected String level;
        protected String question;
        protected String optionA,optionB,optionC,optionD;
        protected String answer;
        protected int time;
        protected int point;
        public QuestionsInfo(String level, String question,String optionA,String optionB, String optionC, String optionD, String
answer, int time,int point){
                this.level = level;
                this.question = question;
                this.answer = answer;
                this.time = time;
                this.point = point;
        }
        public int getPoint() {
                return point;
        }
        public void setPoint(int point) {
                this.point = point;
        }
        // setters
        public void setAnswer(String answer){
                this.answer = answer;
        }
        public void setTime(int time){
          this.time = time;
        }
        public void setQuestion(String question){
                this.question = question;
        }
       
        // getters
        public String getLevel(){
                  return level;
          }
          public String getAnswer(){
                  return answer;
          }
          public String getQuestion(){
                  return question;
          }
          public String getOptionA(){
                  return optionA;
          }
          public String getOptionB(){
              return optionB;
      }
          public String getOptionC(){
              return optionC;
      }
          public String getOptionD(){
              return optionD;
      }
          public int getTime(){
                  return time;
          }

          public String toString(){
                  return level +"-"+ question +"-" + optionA+optionB+optionC+optionD + "-" +  answer + "-" +
Integer.toString(time);
          }

}