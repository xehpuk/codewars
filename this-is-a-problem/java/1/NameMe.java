public class NameMe {
    final String firstName;
    final String lastName;
    final String fullName;

    NameMe(String first, String last) {
        firstName = first;
        lastName = last;
        fullName = first + ' ' + last;
   }
   
   String getFirstName() {
     return firstName;
   }
   
   String getLastName() {
     return lastName;
   }
   
   String getFullName() {
     return fullName;
   }
 }