package GBJava;


import java.util.*;

public class PhoneBook {

        HashMap<String,String> pb = new HashMap<>();
        List <String> result = new ArrayList<>();

        public void add (String phoneNumber,String surname) {

            if (pb.containsValue(surname)) {
                pb.put(phoneNumber, surname);
                result.add(phoneNumber);
            } else {
                pb.put(phoneNumber, surname);
            }
        }



        public void showContents () {
            for (Map.Entry entry : pb.entrySet()) {
                System.out.println(String.format("key = %s, value = %s", entry.getKey(), entry.getValue()));
            }
        }

        public void get(String surname) {
             for (Map.Entry entry : pb.entrySet()) {
               if(pb.containsValue(surname)) {
               }
           }
            System.out.println("Contact " + surname + " registered phone numbers are: " + result);
       }

                @Override
         public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         PhoneBook phoneBook = (PhoneBook) o;
         return Objects.equals(pb, phoneBook.pb);
         }

                @Override
         public int hashCode() {
         return Objects.hash(pb);
         }
            }