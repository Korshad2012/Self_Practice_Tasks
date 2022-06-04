package day7_multiIf_nestedIf;

public class FielTrip {


    public static void main(String[] args) {


        int gradeNumber = 0;

        String result = "";


        if (gradeNumber >= 1 && gradeNumber <= 6) {

            if (gradeNumber == 1) {
                result = "location - Apple orchard\nnumber of group -3\nteacher in charge - Ms.Smith";
            } else if (gradeNumber == 2) {
                result = "location - Zoo\nnumber of group -7\nteacher in charge - Mr.Lee";
            } else if (gradeNumber == 3) {
                result = "location - Aquarium\nnumber of group -5\nteacher in charge - Ms.Wilson";
            } else if (gradeNumber == 4) {
                result = "location - Movie Theater\nnumber of group -2\nteacher in charge - Ms.Reyes";
            } else if (gradeNumber == 5) {
                result = "location - Museum\nnumber of group -5\n teacher in charge - Ms.Lela";
            } else  {
                result = "location - Six Flags\nnumber of group -8\n teacher in charge - Mr.Watt";
            }
        } else {
            result = "location - unknown\nnumber of group -0\nteacher in charge - unknown";
        }
        System.out.println(result);


    }


}

/*
2. Create a class called FieldTrip. Your school goes on a Field trip each year.The place you go will be based on your grade.
		Given a variable gradeNumber figure out the details of your field trip. Print the information at the end.
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
			        	numer of gourps - 0
			        	teacher in charge - Unknown

 */