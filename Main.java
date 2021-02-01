public class Main {

    public static void main(String[] args) {

        employee[] empArr = new employee[5];
        empArr[0] = new employee("Nesterov Sergey", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        empArr[1] = new employee("Kulchenko Ivan", "Programmer developer", "ivivan1@mailbox.com", "1892312312", 40000, 40);
        empArr[2] = new employee("Andreev Mikhail", "Administrator", "ivivan2@mailbox.com", "2892312312", 50000, 50);
        empArr[3] = new employee("Sidorov Nikita", "Secretary", "ivivan3@mailbox.com", "3892312312", 60000, 60);
        empArr[4] = new employee("Abramovich Roman", "Manager", "ivivan4@mailbox.com", "4892312312", 70000, 70);

        for(employee item : empArr) {
            if(item.GetAge() > 40) item.Show();
        }
    }
}

