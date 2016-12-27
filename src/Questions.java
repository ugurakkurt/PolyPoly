
import java.util.*;
import java.io.*;

public class Questions {

       


        static ArrayList <QuestionsInfo> easyHistory = new ArrayList<> ();
        static ArrayList <QuestionsInfo> easyChemistry = new ArrayList<> ();
        static ArrayList <QuestionsInfo> easyMath = new ArrayList<> ();
        static ArrayList <QuestionsInfo> easyGeneralCulture = new ArrayList<> ();
        static ArrayList <QuestionsInfo> easyBiology = new ArrayList<> ();
        static ArrayList <QuestionsInfo> easyPhysics = new ArrayList<> ();
        static ArrayList <QuestionsInfo> mediumHistory = new ArrayList<> ();
        static ArrayList <QuestionsInfo> mediumChemistry = new ArrayList<>();
        static ArrayList <QuestionsInfo> mediumMath = new ArrayList<> ();
        static ArrayList <QuestionsInfo> mediumGeneralCulture = new ArrayList<> ();
        static ArrayList <QuestionsInfo> mediumBiology = new ArrayList<> ();
        static ArrayList <QuestionsInfo> mediumPhysics = new ArrayList<> ();
        static ArrayList <QuestionsInfo> hardHistory= new ArrayList<> ();
        static ArrayList <QuestionsInfo> hardChemistry = new ArrayList<> ();
        static ArrayList <QuestionsInfo> hardMath = new ArrayList<> ();
        static ArrayList <QuestionsInfo> hardGeneralCulture = new ArrayList<> ();
        static ArrayList <QuestionsInfo> hardBiology = new ArrayList<> ();
        static ArrayList <QuestionsInfo> hardPhysics = new ArrayList<> ();

        String questions;
        String line;
        String answer;
        String optionA,optionB,optionC,optionD;
        Scanner
fileScan1,fileScan2,fileScan3,fileScan4,fileScan5,fileScan6,fileScan7,fileScan8,fileScan9,fileScan10,fileScan11,fileScan12,fileScan13,fileScan14,fileScan15,fileScan16,fileScan17,fileScan18,
queScan;

        public void setAllQuestions() throws FileNotFoundException
        {

                for(int i = 0; i<40; i++){
                easyHistory.add(new QuestionsInfo("a","b","c","x","y","z","d",0,100));
                mediumHistory.add(new QuestionsInfo("a","b","c","x","y","z","d",0,100));
                hardHistory.add(new QuestionsInfo("a","b","c","x","y","z","d",0,100));
                easyChemistry.add(new QuestionsInfo("a","b","c","x","y","z","d",0,100));
                mediumChemistry.add(new QuestionsInfo("a","b","c","x","y","z","d",0,100));
                hardChemistry.add(new QuestionsInfo("a","b","c","x","y","z","d",0,100));
                easyMath.add(new QuestionsInfo("a","b","c","x","y","z","d",0,100));
                mediumMath.add(new QuestionsInfo("a","b","c","x","y","z","d",0,100));
                hardMath.add(new QuestionsInfo("a","b","c","x","y","z","d",0,100));
                easyGeneralCulture.add(new QuestionsInfo("a","b","c","x","y","z","d",0,100));
                mediumGeneralCulture.add(new QuestionsInfo("a","b","c","x","y","z","d",0,100));
                hardGeneralCulture.add(new QuestionsInfo("a","b","c","x","y","z","d",0,100));
                easyBiology.add(new QuestionsInfo("a","b","c","x","y","z","d",0,100));
                mediumBiology.add(new QuestionsInfo("a","b","c","x","y","z","d",0,100));
                hardBiology.add(new QuestionsInfo("a","b","c","x","y","z","d",0,100));
                easyPhysics.add(new QuestionsInfo("a","b","c","x","y","z","d",0,100));
                mediumPhysics.add(new QuestionsInfo("a","b","c","x","y","z","d",0,100));
                hardPhysics.add(new QuestionsInfo("a","b","c","x","y","z","d",0,100));
                }

                 fileScan1 = new Scanner(new
File("easyHistoryQuestions.txt"));
         int index = 0;
         while(fileScan1.hasNext() && index<40){
                 line = fileScan1.nextLine();
             easyHistory.get(index).question = line;
             index++;
         }

         fileScan2 = new Scanner(new File("mediumHistoryQuestions.txt"));
         index = 0;
         while(fileScan2.hasNext() && index<40){
                 line = fileScan2.nextLine();
             mediumHistory.get(index).question = line;
             index++;
         }

         fileScan3 = new Scanner(new File("hardHistoryQuestions.txt"));
         index = 0;
         while(fileScan3.hasNext() && index<40){
                 line = fileScan3.nextLine();
             hardHistory.get(index).question = line;
             index++;
         }

         fileScan4 = new Scanner(new File("easyChemistryQuestions.txt"));
         index = 0;
         while(fileScan4.hasNext() && index<40){
                 line = fileScan4.nextLine();
                 easyChemistry.get(index).question = line;
             index++;
         }


         fileScan5 = new Scanner(new File("mediumChemistryQuestions.txt"));
         index = 0;
         while(fileScan5.hasNext() && index<40){
                 line = fileScan5.nextLine();
                 mediumChemistry.get(index).question = line;
             index++;
         }

         fileScan6 = new Scanner(new File("hardChemistryQuestions.txt"));
         index = 0;
         while(fileScan6.hasNext() && index<40){
                 line = fileScan6.nextLine();
                 hardChemistry.get(index).question = line;
             index++;
         }

         fileScan7 = new Scanner(new File("easyMathQuestions.txt"));
         index = 0;
         while(fileScan7.hasNext() && index<40){
                 line = fileScan7.nextLine();
                 easyMath.get(index).question = line;
             index++;
         }

         fileScan8 = new Scanner(new File("mediumMathQuestions.txt"));
         index = 0;
         while(fileScan8.hasNext() && index<40){
                 line = fileScan8.nextLine();
                 mediumMath.get(index).question = line;
             index++;
         }

         fileScan9 = new Scanner(new File("hardMathQuestions.txt"));
         index = 0;
         while(fileScan9.hasNext() && index<40){
                 line = fileScan9.nextLine();
                 hardMath.get(index).question = line;
             index++;
         }

         fileScan10 = new Scanner(new File("easyGeneralQuestions.txt"));
         index = 0;
         while(fileScan10.hasNext() && index<40){
                 line = fileScan10.nextLine();
                 easyGeneralCulture.get(index).question = line;
             index++;
         }

         fileScan11 = new Scanner(new File("mediumGeneralQuestions.txt"));
         index = 0;
         while(fileScan11.hasNext() && index<40){
                 line = fileScan11.nextLine();
                 mediumGeneralCulture.get(index).question = line;
             index++;
         }

         fileScan12 = new Scanner(new File("hardGeneralQuestions.txt"));
         index = 0;
         while(fileScan12.hasNext() && index<40){
                 line = fileScan12.nextLine();
                 hardGeneralCulture.get(index).question = line;
             index++;
         }

         fileScan13 = new Scanner(new File("easyBiologyQuestions.txt"));
         index = 0;
         while(fileScan13.hasNext() && index<40){
                 line = fileScan13.nextLine();
                 easyBiology.get(index).question = line;
             index++;
         }

         fileScan14 = new Scanner(new File("mediumBiologyQuestions.txt"));
         index = 0;
         while(fileScan14.hasNext() && index<40){
                 line = fileScan14.nextLine();
                 mediumBiology.get(index).question = line;
             index++;
         }

         fileScan15 = new Scanner(new File("hardBiologyQuestions.txt"));
         index = 0;
         while(fileScan15.hasNext() && index<40){
                 line = fileScan15.nextLine();
                 hardBiology.get(index).question = line;
             index++;
         }

         fileScan16 = new Scanner(new File("easyPhysicsQuestions.txt"));
         index = 0;
         while(fileScan16.hasNext() && index<40){
                 line = fileScan16.nextLine();
                 easyPhysics.get(index).question = line;
             index++;
         }

         fileScan17 = new Scanner(new File("mediumPhysicsQuestions.txt"));
         index = 0;
         while(fileScan17.hasNext() && index<40){
                 line = fileScan17.nextLine();
                 mediumPhysics.get(index).question = line;
             index++;
         }

         fileScan18 = new Scanner(new File("hardPhysicsQuestions.txt"));
         index = 0;
         while(fileScan18.hasNext() && index<40){
                 line = fileScan18.nextLine();
                 hardPhysics.get(index).question = line;
             index++;
         }

     }

        public void setAllOptions() throws FileNotFoundException
        {
                fileScan1 = new Scanner(new File("easyHistoryOptions.txt"));
                fileScan2= new Scanner(new File("easyChemistryOptions.txt"));
                fileScan3 = new Scanner(new File("easyMathOptions.txt"));
                fileScan4 = new Scanner(new File("easyGeneralOptions.txt"));
                fileScan5 = new Scanner(new File("easyBiologyOptions.txt"));
                fileScan6 = new Scanner(new File("easyPhysicsOptions.txt"));
                fileScan7 = new Scanner(new File("mediumHistoryOptions.txt"));
                fileScan8 = new Scanner(new File("mediumChemistryOptions.txt"));
                fileScan9 = new Scanner(new File("mediumMathOptions.txt"));
                fileScan10 = new Scanner(new File("mediumGeneralOptions.txt"));
                fileScan11 = new Scanner(new File("mediumBiologyOptions.txt"));
                fileScan12 = new Scanner(new File("mediumPhysicsOptions.txt"));
                fileScan13 = new Scanner(new File("hardHistoryOptions.txt"));
                fileScan14 = new Scanner(new File("hardChemistryOptions.txt"));
                fileScan15 = new Scanner(new File("hardMathOptions.txt"));
                fileScan16 = new Scanner(new File("hardGeneralOptions.txt"));
                fileScan17 = new Scanner(new File("hardBiologyOptions.txt"));
                fileScan18 = new Scanner(new File("hardPhysicsOptions.txt"));

                int index = 0;
        while(fileScan1.hasNext() && index<40){
        	optionA = fileScan1.nextLine();
        	optionB = fileScan1.nextLine();
        	optionC = fileScan1.nextLine();
        	optionD= fileScan1.nextLine();

            easyHistory.get(index).optionA = optionA;
            easyHistory.get(index).optionB = optionB;
            easyHistory.get(index).optionC = optionC;
            easyHistory.get(index).optionD = optionD;
            index++;
        }

        index = 0;
        while(fileScan2.hasNext() && index<40){
        	optionA = fileScan2.nextLine();
        	optionB = fileScan2.nextLine();
        	optionC = fileScan2.nextLine();
        	optionD= fileScan2.nextLine();

            easyChemistry.get(index).optionA = optionA;
            easyChemistry.get(index).optionB = optionB;
            easyChemistry.get(index).optionC = optionC;
            easyChemistry.get(index).optionD = optionD;
            index++;
        }

        index = 0;
        while(fileScan3.hasNext() && index<40){
        	optionA  = fileScan3.nextLine();
                optionB = fileScan3.nextLine();
                optionC = fileScan3.nextLine();
                optionD= fileScan3.nextLine();

                easyMath.get(index).optionA = optionA;
                easyMath.get(index).optionB = optionB;
                easyMath.get(index).optionC = optionC;
                easyMath.get(index).optionD = optionD;
            index++;
        }

        index = 0;
        while(fileScan4.hasNext() && index<40){
        	optionA = fileScan4.nextLine();
                optionB = fileScan4.nextLine();
                optionC = fileScan4.nextLine();
                optionD= fileScan4.nextLine();

                easyGeneralCulture.get(index).optionA = optionA;
                easyGeneralCulture.get(index).optionB = optionB;
                easyGeneralCulture.get(index).optionC = optionC;
                easyGeneralCulture.get(index).optionD = optionD;
            index++;
        }
        index = 0;
        while(fileScan5.hasNext() && index<40){
        	optionA  = fileScan5.nextLine();
                optionB = fileScan5.nextLine();
                optionC = fileScan5.nextLine();
                optionD= fileScan5.nextLine();

                easyBiology.get(index).optionA = optionA;
                easyBiology.get(index).optionB = optionB;
                easyBiology.get(index).optionC = optionC;
                easyBiology.get(index).optionD = optionD;
            index++;
        }
        index = 0;
        while(fileScan6.hasNext() && index<40){
        	optionA = fileScan6.nextLine();
                optionB = fileScan6.nextLine();
                optionC = fileScan6.nextLine();
                optionD= fileScan6.nextLine();

                easyPhysics.get(index).optionA = optionA;
                easyPhysics.get(index).optionB = optionB;
                easyPhysics.get(index).optionC = optionC;
                easyPhysics.get(index).optionD = optionD;
            index++;
        }

        index = 0;
        while(fileScan7.hasNext() && index<40){
        	optionA = fileScan7.nextLine();
                        optionB = fileScan7.nextLine();
                        optionC = fileScan7.nextLine();
                        optionD= fileScan7.nextLine();

                        mediumHistory.get(index).optionA = optionA;
                        mediumHistory.get(index).optionB = optionB;
                        mediumHistory.get(index).optionC = optionC;
                        mediumHistory.get(index).optionD = optionD;
                 index++;
        }

        index = 0;
        while(fileScan8.hasNext() && index<40){
        	optionA = fileScan8.nextLine();
                optionB = fileScan8.nextLine();
                optionC = fileScan8.nextLine();
                optionD= fileScan8.nextLine();

                mediumChemistry.get(index).optionA = optionA;
                mediumChemistry.get(index).optionB = optionB;
                mediumChemistry.get(index).optionC = optionC;
                mediumChemistry.get(index).optionD = optionD;
            index++;
        }
        index = 0;
        while(fileScan9.hasNext() && index<40){
        	optionA = fileScan9.nextLine();
                optionB = fileScan9.nextLine();
                optionC = fileScan9.nextLine();
                optionD= fileScan9.nextLine();

                mediumMath.get(index).optionA = optionA;
                mediumMath.get(index).optionB = optionB;
                mediumMath.get(index).optionC = optionC;
                mediumMath.get(index).optionD = optionD;
            index++;
        }
        index = 0;
        while(fileScan10.hasNext() && index<40){
        	optionA = fileScan10.nextLine();
                optionB = fileScan10.nextLine();
                optionC = fileScan10.nextLine();
                optionD= fileScan10.nextLine();

                mediumGeneralCulture.get(index).optionA = optionA;
                mediumGeneralCulture.get(index).optionB = optionB;
                mediumGeneralCulture.get(index).optionC = optionC;
                mediumGeneralCulture.get(index).optionD = optionD;
            index++;
        }
        index = 0;
        while(fileScan11.hasNext() && index<40){
        	optionA = fileScan11.nextLine();
                optionB = fileScan11.nextLine();
                optionC = fileScan11.nextLine();
                optionD= fileScan11.nextLine();

                mediumBiology.get(index).optionA = optionA;
                mediumBiology.get(index).optionB = optionB;
                mediumBiology.get(index).optionC = optionC;
                mediumBiology.get(index).optionD = optionD;
            index++;
        }
        index = 0;
        while(fileScan12.hasNext() && index<40){
        	optionA = fileScan12.nextLine();
                optionB = fileScan12.nextLine();
                optionC = fileScan12.nextLine();
                optionD= fileScan12.nextLine();

                mediumPhysics.get(index).optionA = optionA;
                mediumPhysics.get(index).optionB = optionB;
                mediumPhysics.get(index).optionC = optionC;
                mediumPhysics.get(index).optionD = optionD;
            index++;
        }
        index = 0;
        while(fileScan13.hasNext() && index<40){
        	optionA = fileScan13.nextLine();
                optionB = fileScan13.nextLine();
                optionC = fileScan13.nextLine();
                optionD= fileScan13.nextLine();
                
                hardHistory.get(index).optionA = optionA;
                hardHistory.get(index).optionB = optionB;
                hardHistory.get(index).optionC = optionC;
                hardHistory.get(index).optionD = optionD;
            index++;
        }
        index = 0;
        while(fileScan14.hasNext() && index<40){
        	optionA = fileScan14.nextLine();
                optionB = fileScan14.nextLine();
                optionC = fileScan14.nextLine();
                optionD= fileScan14.nextLine();

                hardChemistry.get(index).optionA = optionA;
                hardChemistry.get(index).optionB = optionB;
                hardChemistry.get(index).optionC = optionC;
                hardChemistry.get(index).optionD = optionD;
            index++;
        }
        index = 0;
        while(fileScan15.hasNext() && index<40){
        	optionA = fileScan15.nextLine();
                optionB = fileScan15.nextLine();
                optionC = fileScan15.nextLine();
                optionD= fileScan15.nextLine();

                hardMath.get(index).optionA = optionA;
                hardMath.get(index).optionB = optionB;
                hardMath.get(index).optionC = optionC;
                hardMath.get(index).optionD = optionD;
            index++;
        }
        index = 0;
        while(fileScan16.hasNext() && index<40){
        	optionA = fileScan16.nextLine();
                optionB = fileScan16.nextLine();
                optionC = fileScan16.nextLine();
                optionD= fileScan16.nextLine();

                hardGeneralCulture.get(index).optionA = optionA;
                hardGeneralCulture.get(index).optionB = optionB;
                hardGeneralCulture.get(index).optionC = optionC;
                hardGeneralCulture.get(index).optionD = optionD;
            index++;
        }
        index = 0;
        while(fileScan17.hasNext() && index<40){
        	optionA = fileScan17.nextLine();
                optionB = fileScan17.nextLine();
                optionC = fileScan17.nextLine();
                optionD= fileScan17.nextLine();

                hardBiology.get(index).optionA = optionA;
                hardBiology.get(index).optionB = optionB;
                hardBiology.get(index).optionC = optionC;
                hardBiology.get(index).optionD = optionD;
            index++;
        }
        index = 0;
        while(fileScan18.hasNext() && index<40){
        	optionA = fileScan18.nextLine();
                optionB = fileScan18.nextLine();
                optionC = fileScan18.nextLine();
                optionD= fileScan18.nextLine();

                hardPhysics.get(index).optionA = optionA;
                hardPhysics.get(index).optionB = optionB;
                hardPhysics.get(index).optionC = optionC;
                hardPhysics.get(index).optionD = optionD;
            index++;
        }

    }
        public void setAllAnswers() throws FileNotFoundException
        {
                fileScan1 = new Scanner(new File("easyHistoryAnswers.txt"));
                fileScan2 = new Scanner(new
File("mediumHistoryAnswers.txt"));
                fileScan3 = new Scanner(new File("hardHistoryAnswers.txt"));
                fileScan4 = new Scanner(new
File("easyChemistryAnswers.txt"));
                fileScan5 = new Scanner(new
File("mediumChemistryAnswers.txt"));
                fileScan6 = new Scanner(new
File("hardChemistryAnswers.txt"));
                fileScan7 = new Scanner(new File("easyMathAnswers.txt"));
                fileScan8 = new Scanner(new File("mediumMathAnswers.txt"));
                fileScan9 = new Scanner(new File("hardMathanswers.txt"));
                fileScan10 = new Scanner(new File("easyGeneralAnswers.txt"));
                fileScan11 = new Scanner(new
File("mediumGeneralAnswers.txt"));
                fileScan12 = new Scanner(new File("hardGeneralAnswers.txt"));
                fileScan13 = new Scanner(new File("easyBiologyAnswers.txt"));
                fileScan14 = new Scanner(new
File("mediumBiologyAnswers.txt"));
                fileScan15 = new Scanner(new File("hardBiologyAnswers.txt"));
                fileScan16 = new Scanner(new File("easyPhysicsAnswers.txt"));
                fileScan17 = new Scanner(new
File("mediumPhysicsAnswers.txt"));
                fileScan18 = new Scanner(new File("hardPhysicsAnswers.txt"));

                int index = 0;
        while(fileScan1.hasNext() && index<40){
                answer = fileScan1.next();
            easyHistory.get(index).answer = answer;
            index++;
        }
        index = 0;
        while(fileScan2.hasNext() && index<40){
                answer = fileScan2.next();
            mediumHistory.get(index).answer = answer;
            index++;
        }
        index = 0;
        while(fileScan3.hasNext() && index<40){
                answer = fileScan3.next();
            hardHistory.get(index).answer = answer;
            index++;
        }
        index = 0;
        while(fileScan4.hasNext() && index<40){
                answer = fileScan4.next();
            easyChemistry.get(index).answer = answer;
            index++;
        }
        index = 0;
        while(fileScan5.hasNext() && index<40){
                answer = fileScan5.next();
            mediumChemistry.get(index).answer = answer;
            index++;
        }
        index = 0;
        while(fileScan6.hasNext() && index<40){
                answer = fileScan6.next();
            hardChemistry.get(index).answer = answer;
            index++;
        }
        index = 0;
        while(fileScan7.hasNext() && index<40){
                answer = fileScan7.next();
            easyMath.get(index).answer = answer;
            index++;
        }
        index = 0;
        while(fileScan8.hasNext() && index<40){
                answer = fileScan8.next();
            mediumMath.get(index).answer = answer;
            index++;
        }
        index = 0;
        while(fileScan9.hasNext() && index<40){
                answer = fileScan9.next();
            hardMath.get(index).answer = answer;
            index++;
        }
        index = 0;
        while(fileScan10.hasNext() && index<40){
                answer = fileScan10.next();
            easyGeneralCulture.get(index).answer = answer;
            index++;
        }
        index = 0;
        while(fileScan11.hasNext() && index<40){
                answer = fileScan11.next();
            mediumGeneralCulture.get(index).answer = answer;
            index++;
        }
        index = 0;
        while(fileScan12.hasNext() && index<40){
                answer = fileScan12.next();
            hardGeneralCulture.get(index).answer = answer;
            index++;
        }
        index = 0;
        while(fileScan13.hasNext() && index<40){
                answer = fileScan13.next();
            easyBiology.get(index).answer = answer;
            index++;
        }
        index = 0;
        while(fileScan14.hasNext() && index<40){
                answer = fileScan14.next();
            mediumBiology.get(index).answer = answer;
            index++;
        }
        index = 0;
        while(fileScan15.hasNext() && index<40){
                answer = fileScan15.next();
            hardBiology.get(index).answer = answer;
            index++;
        }
        index = 0;
        while(fileScan16.hasNext() && index<40){
                answer = fileScan16.next();
            easyPhysics.get(index).answer = answer;
            index++;
        }
        index = 0;
        while(fileScan17.hasNext() && index<40){
                answer = fileScan17.next();
            mediumPhysics.get(index).answer = answer;
            index++;
        }
        index = 0;
        while(fileScan18.hasNext() && index<40){
                answer = fileScan18.next();
            hardPhysics.get(index).answer = answer;
            index++;
        }

    }
        public void printQuestions(){
             for(int i=0; i< 40; i++ ){
             System.out.println(easyBiology.get(i).question);
             System.out.println(easyBiology.get(i).optionA + easyBiology.get(i).optionB+ easyBiology.get(i).optionC + easyBiology.get(i).optionD);
             System.out.println("answer is: " + easyBiology.get(i).answer);
             System.out.println();
             }

        }
}