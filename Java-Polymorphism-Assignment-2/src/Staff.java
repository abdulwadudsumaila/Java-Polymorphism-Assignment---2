public class Staff
{
   StaffMember[] staffList;

   //  Sets up the list of staff members.
   public Staff ()
   {
      staffList = new StaffMember[6];

      staffList[0] = new Executive ("Wadud", "Adjen Kotoku",
         "+233-246-111-222", "H098765435", 2423.07);

      staffList[1] = new Employee ("Kofi", "Atta Mills lane",
         "+233-263-333-992", "H098765990", 246.25);
      staffList[2] = new Employee ("Kojo", "Tamale-Kumbungu",
         "+233-543-231-711", "H010223047", 169.03);

      staffList[3] = new Hourly ("Abena", "Naa Luro estate.",
         "233-275-987-345", "H058473225", 10.55);

      staffList[4] = new Volunteer ("Sumaila", "Kuffour lane.",
         "+233-201-304-987");
      staffList[5] = new Volunteer ("Ama", "Modern city Lane",
         "+233-505-980-163");

      ((Executive)staffList[0]).awardBonus (500.00);

      ((Hourly)staffList[3]).addHours (40);
      
   }
  
      //  Pays all staff members.
    
      public void payday ()
      {
         double amount;

         for (int count=0; count < staffList.length; count++)
         {
            System.out.println (staffList[count]);

            amount = staffList[count].pay();  

            if (amount == 0.0)
               System.out.println ("Thanks!");
            else
               System.out.println ("Paid: " + amount);

            System.out.println ("-----------------------------------");
         }
   }

  
}