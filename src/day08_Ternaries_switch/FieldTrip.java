package day08_Ternaries_switch;

public class FieldTrip {
    public static void main(String[] args) {

      int gradeNumber=7;
        String result="";
      if(gradeNumber>=1 && gradeNumber<=6){
          if(gradeNumber==1){
              result="location -Apple orchard\nnumber of groups - 3\nteacher in charge - Mr. Smith";
          }else if(gradeNumber==2){
              result="Location - Zoo\nnumber of groups: 7\nteacher in charge - Mr. Lee";
          }else if(gradeNumber==3){
              result="Location - Aquarium\nnumber of groups - 5\nteacher in charge - Ms.Wilson ";
          }else if(gradeNumber==4){
              result="location - Movie theater\nnumber of groups - 2\nteacher in charge - Ms.Reyes";
          }else if(gradeNumber==5){
              result="location - Museum\nnumber of groups - 5\nteacher in charge - Ms. Lela";
          }else{
              result="location - Six Flags\nnumber of groups - 8\nteacher in charge- Mr.Watt";
          }
      }else {
          result="location - Unknown\nnumber of groups - 0\nteachers in charge - Unknown";
      }
        System.out.println(result);


/*
                 Second way approach:


                 String location = "Unknown";
        int numOfGroups = 0;
        String teacher = "Unknown";

        if(grade >= 1 && grade <= 6){

            if(grade == 1){
                location = "Apple orchard";
                numOfGroups = 3;
                teacher = "Ms. Smith";
            }else if(grade == 2){
                location = "Zoo";
                numOfGroups = 7;
                teacher = "Mr. Lee";
            }else if(grade == 3){
                location = "Aquarium";
                numOfGroups = 5;
                teacher = "Ms.Wilson";
            }else if(grade ==4){
                location = "Movie theater";
                numOfGroups = 2;
                teacher = "Ms. Reyes";
            }else if(grade ==5){
                location = "Museum";
                numOfGroups = 5;
                teacher = "Ms. Lela";
            }else{ // grade  == 6
                location = "Six Flags";
                numOfGroups = 6;
                teacher = "Mr. Watt";
            }

        }


        System.out.println("Local - " + location);
        System.out.println("Number of groups - "+numOfGroups);
        System.out.println("Teacher in charge - "+teacher);

 */

    }
}
/*
	 2. Create a class called FieldTrip. Your school goes on a Field trip each year.
	 The place you go will be based on your grade.
		Given a variable gradeNumber figure out the details of your field trip.
		Print the information at the end.
			    Data based on grade:
			        grade - 1
				        location -  Apple orchard
				        number of groups - 3
				        teacher in charge - Ms. Smith

			        grade - 2
				        location - Zoo
				        number of groups - 7
				        teacher in charge - Mr. Lee

			        grade - 3
				        location - Aquarium
				        number of groups - 5
				        teacher in charge - Ms. Wilson

			        grade - 4
				        location - Movie theater
				        number of groups - 2
				        teacher in charge - Ms. Reyes

			        grade - 5
				        location - Museum
				        number of groups - 5
				        teacher in charge - Ms. Lela

			        grade - 6
				        location - Six Flags
				        number of groups - 8
				        teacher in charge - Mr. Watt

			        for any other gradeNumber:
			        	location - Unknown
			        	number of groups - 0
			        	teacher in charge - Unknown
 */