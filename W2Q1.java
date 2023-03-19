 public static void main(String[] args) {
        int year=2023;
        int population=85032486;
        int popBirth=5*365*24*60*60/10;
        int popDeath=5*365*24*60*60/15;
        int popIncome=5*365*24*60/2;
        int popGoing=5*365*24*60/3;
        int growthPer5Year=popBirth-popDeath+popIncome-popGoing;
        int newPopulation=population+growthPer5Year;
        int count=0;
        while (year>=2023){
            count++;
            year+=5;
            newPopulation=population+count*growthPer5Year;
            System.out.print("The Population of Turkiye in "+ year+":"+newPopulation+"\n");
            if (year>2070)break;
        }  
    }  