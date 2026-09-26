import java.lang.*;
import java.util.*;

// create table student(RID int, Name varchar(255), Salary int, Age int, City varchar(255));
// Database table / schema
class Student
{
    public int RID;
    public String Name;
    public int Salary;
    public int Age;
    public String City;
    
    private static int Generator;

    static
    {
        Generator = 0;
    }

    public Student(String str, int value, int no, String str1)
    {
        this.RID = ++Generator;
        this.Name = str;
        this.Salary = value;
        this.Age = no;
        this.City = str1;
    }

    public void DisplayData()
    {
        System.out.println("|\t"+this.RID+"\t|\t"+this.Name + "\t|\t" + this.Salary+"\t|\t"+this.Age+"\t|\t"+this.City+"\t|");
        System.out.println("---------------------------------------------------------------------------------");
    }
}

class DBMS
{
    public LinkedList <Student> lobj;

    public DBMS()
    {
        lobj = new LinkedList<>();
    }

    public void StartDBMS()
    {
        Scanner scanobj = new Scanner(System.in);
        System.out.println("Marvellous customised DBMS started succesfully....");
        String Query = "";

        while(true)
        {
            System.out.print("Marvellous DBMS console >");
            Query = scanobj.nextLine();
            Query = Query.toLowerCase();

            String tokens[] = Query.split(" ");
            int QuerySize = tokens.length;

            if(QuerySize == 1)
            {
                if("help".equals(tokens[0]))
                {
                    System.out.printf("This application is used to demonstrates the customised DBMS\n\n");
                    System.out.println("Description : Insert new Record  :");
                    System.out.println("Query : Insert into student Name Salary Age City\n");
                    System.out.println("Description : Select All Records : ");
                    System.out.println("Query : Select * from student\n");
                    System.out.println("Description : Select Specific Record using Name :");
                    System.out.println("Query : Select * from student where name = Student_Name\n");
                    System.out.println("Description : Select Specific Record using RID :");
                    System.out.println("Query : Select * from student where RID = Student_RID\n");
                    System.out.println("Description : Select Specific Record using Age :");
                    System.out.println("Query : Select * from student where Age = Student_Age\n");
                    System.out.println("Description : Select Specific Record using City  :");
                    System.out.println("Query : Select * from student where city = Student_City\n");
                    System.out.println("Description : Select less RID");
                    System.out.println("Query : Select * from student where RID < Bigger_RID\n");
                    System.out.println("Description : Select less than or equal to RID");
                    System.out.println("Query : Select * from student where RID <= Bigger_RID\n");
                    System.out.println("Description : Select greater RID");
                    System.out.println("Query : Select * from student where RID > Smaller_RID\n");
                    System.out.println("Description : Select greater than or equal to  RID");
                    System.out.println("Query : Select * from student where RID >= Smaller_RID\n");
                    System.out.println("Description : Select less Salary");
                    System.out.println("Query : Select * from student where Salary < Bigger_Salary\n");
                    System.out.println("Description : Select less than or equal to Salary");
                    System.out.println("Query : Select * from student where Salary <= Bigger_Salary\n");
                    System.out.println("Description : Select greater Salary");
                    System.out.println("Query : Select * from student where Salary > Smaller_Salary\n");
                    System.out.println("Description : Select greater than or equal to Salary");
                    System.out.println("Query : Select * from student where Salary >= Smaller_Salary\n");
                    System.out.println("Description : Select less Age");
                    System.out.println("Query : Select * from student where Age < Bigger_Age\n");
                    System.out.println("Description : Select less than or equal to Age");
                    System.out.println("Query : Select * from student where Age <= Bigger_Age\n");
                    System.out.println("Description : Select greater Age");
                    System.out.println("Query : Select * from student where Age > Smaller_Age\n");
                    System.out.println("Description : Select greater than or equal to Age");
                    System.out.println("Query : Select * from student where Age >= Smaller_Age\n");
                    System.out.println("Description : Select Specific Record using Name AND Age :");
                    System.out.println("Query : Select * from student where name = Student_Name and age = Student_Age\n");
                    System.out.println("Description : Select Specific Record using Name AND City :");
                    System.out.println("Query : Select * from student where name = Student_Name and age = Student_City\n");
                    System.out.println("Description : Select Specific Record using Name OR Age :");
                    System.out.println("Query : Select * from student where name = Student_Name OR age = Student_Age\n");
                    System.out.println("Description : Select Specific Record using Name OR City :");
                    System.out.println("Query : Select * from student where name = Student_Name OR city = Student_City\n");
                    System.out.println("Description : Select Salary Using BETWEEN  :");
                    System.out.println("Query : Select * from student where Salary BETWEEN Bigger_Amount and Smaller_Amount\n");
                    System.out.println("Description : Select Age Using BETWEEN  :");
                    System.out.println("Query : Select * from student where Age BETWEEN Bigger_Age and Smaller_Age\n");
                    System.out.println("Description : Update Specific Name using RID :");
                    System.out.println("Query : Update table student set name = Student_Name where RID = Student_RID\n");
                    System.out.println("Description : Update Specific Age using RID :");
                    System.out.println("Query : Update table student set age = Student_Age where RID = Student_RID\n");
                    System.out.println("Description : Update Specific City using RID :");
                    System.out.println("Query : Update table student set city = Student_City where RID = Student_RID\n");
                    System.out.println("Description : Update Specific Name using oldName :");
                    System.out.println("Query : Update table student set Name = Updated_Name where Name = Old_Name\n");
                    System.out.println("Description : Delete specific Record using name :");
                    System.out.println("Query : Delete from student where name = Student_Name\n");
                    System.out.println("Description : Delete specific Record using RID :");
                    System.out.println("Query : Delete from student where RID = Student_RID\n");
                    System.out.println("Description : Display Maximum Salary :");
                    System.out.println("Query : Select max Salary\n");
                    System.out.println("Description : Display Minimum Salary :");
                    System.out.println("Query : Select min Salary\n");
                    System.out.println("Description : Display Sum of Salary :");
                    System.out.println("Query : Select sum Salary\n");
                    System.out.println("Description : Display Average of Salary :");
                    System.out.println("Query : Select avg Salary\n");
                    System.out.println("Description : Display Count of City:");
                    System.out.println("Query : Select count City_Name\n");
                    System.out.println("Count : Count Records\n");
                    System.out.println("Clear : Clear Console\n");
                    System.out.println("Exit : Terminate DBMS\n");
                }
                else if("clear".equals(tokens[0]))
                {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
                else if("count".equals(tokens[0]))
                {
                    AggregateCount();
                }
                else if("exit".equals(tokens[0]))
                {
                    System.out.println("Thank you for using Marvellous DBMS");
                    break;
                }
                else
                {
                    System.out.println("ERROR : Command not found");
                }
            }
            else if(QuerySize == 3)
            {
                if("select".equals(tokens[0]))
                {
                    if("max".equals(tokens[1]))
                    {
                        if("salary".equals(tokens[2])) AggregateMax();
                        else System.out.println("ERROR : at word 3, after max use 'salary' as a word");
                    }
                    else if("min".equals(tokens[1]))
                    {
                        if("salary".equals(tokens[2])) AggregateMin();
                        else System.out.println("ERROR : at word 3, after min use 'salary' as a word");
                    }
                    else if("sum".equals(tokens[1]))
                    {
                        if("salary".equals(tokens[2])) AggregateSum();
                        else System.out.println("ERROR : at word 3, after sum use 'salary' as a word");
                    }
                    else if("avg".equals(tokens[1]))
                    {
                        if("salary".equals(tokens[2])) AggregateAvg();
                        else System.out.println("ERROR : at word 3, after avg use 'salary' as a word");
                    }
                    else if("count".equals(tokens[1]))
                    {
                        CountCity(tokens[2]);
                    }
                    else System.out.println("ERROR : Check at word 2, only use this words('max','min','sum','avg','count')");
                }
                else System.out.println("ERROR : at word 1, use 'select' as a word");
            }
            else if(QuerySize == 4)
            {
                if("select".equals(tokens[0]) && "*".equals(tokens[1]) && "from".equals(tokens[2]) && "student".equals(tokens[3]))
                    DisplayAll();
                else
                    System.out.println("ERROR : invalid select all query");
            }
            else if(QuerySize == 8)
            {
                if("select".equals(tokens[0]) && "*".equals(tokens[1]) && "from".equals(tokens[2]) && "student".equals(tokens[3]) && "where".equals(tokens[4]))
                {
                    if("name".equals(tokens[5]) && "=".equals(tokens[6])) DisplaySpecificName(tokens[7]);
                    else if("rid".equals(tokens[5]))
                    {
                        if("=".equals(tokens[6])) DisplaySpecificRid(Integer.parseInt(tokens[7]));
                        else if("<".equals(tokens[6])) LessRidDis(Integer.parseInt(tokens[7]));
                        else if("<=".equals(tokens[6])) LessRidDis1(Integer.parseInt(tokens[7]));
                        else if(">".equals(tokens[6])) MoreRidDis(Integer.parseInt(tokens[7]));
                        else if(">=".equals(tokens[6])) MoreRidDis1(Integer.parseInt(tokens[7]));
                    }
                    else if("city".equals(tokens[5]) && "=".equals(tokens[6])) DisplaySpecificCity(tokens[7]);
                    else if("age".equals(tokens[5]))
                    {
                        if("=".equals(tokens[6])) DisplaySpecificAge(Integer.parseInt(tokens[7]));
                        else if("<".equals(tokens[6])) LessAgeDis(Integer.parseInt(tokens[7]));
                        else if("<=".equals(tokens[6])) LessAgeDis1(Integer.parseInt(tokens[7]));
                        else if(">".equals(tokens[6])) MoreAgeDis(Integer.parseInt(tokens[7]));
                        else if(">=".equals(tokens[6])) MoreAgeDis1(Integer.parseInt(tokens[7]));
                    }
                    else if("salary".equals(tokens[5]))
                    {
                        if("=".equals(tokens[6])) DisplaySpecificSalary(Integer.parseInt(tokens[7]));
                        else if("<".equals(tokens[6])) LessSalaryDis(Integer.parseInt(tokens[7]));
                        else if(">".equals(tokens[6])) MoreSalaryDis(Integer.parseInt(tokens[7]));
                        else if("<=".equals(tokens[6])) LessSalaryDis2(Integer.parseInt(tokens[7]));
                        else if(">=".equals(tokens[6])) MoreSalaryDis1(Integer.parseInt(tokens[7]));
                    }
                }
            }
            else if(QuerySize == 10)
            {
                if("select".equals(tokens[0]) && "*".equals(tokens[1]) && "from".equals(tokens[2]) && "student".equals(tokens[3]) && "where".equals(tokens[4]))
                {
                    if("salary".equals(tokens[5]) && "between".equals(tokens[6]) && "and".equals(tokens[8]))
                        BetweenSalaryDis(Integer.parseInt(tokens[7]),Integer.parseInt(tokens[9]));
                    else if("age".equals(tokens[5]) && "between".equals(tokens[6]) && "and".equals(tokens[8]))
                        BetweenAgeDis(Integer.parseInt(tokens[7]),Integer.parseInt(tokens[9]));
                    else if("rid".equals(tokens[5]) && "between".equals(tokens[6]) && "and".equals(tokens[8]))
                        BetweenRIDDis(Integer.parseInt(tokens[7]),Integer.parseInt(tokens[9]));
                }
            }
            else if(QuerySize == 11)
            {
                if("update".equals(tokens[0]) && "table".equals(tokens[1]) && "student".equals(tokens[2]) && "set".equals(tokens[3]))
                {
                    if("name".equals(tokens[4]) && "=".equals(tokens[5]) && "where".equals(tokens[7]) && "=".equals(tokens[9]))
                    {
                        if("rid".equals(tokens[8])) Update(Integer.parseInt(tokens[10]),tokens[6]);
                        else if("name".equals(tokens[8])) NUpdate(tokens[10],tokens[6]);
                    }
                    else if("age".equals(tokens[4]) && "=".equals(tokens[5]) && "where".equals(tokens[7]) && "rid".equals(tokens[8]) && "=".equals(tokens[9]))
                        UpdateAge(Integer.parseInt(tokens[10]),Integer.parseInt(tokens[6]));
                    else if("city".equals(tokens[4]) && "=".equals(tokens[5]) && "where".equals(tokens[7]) && "rid".equals(tokens[8]) && "=".equals(tokens[9]))
                        UpdateCity(Integer.parseInt(tokens[10]),tokens[6]);
                }
            }
            else if(QuerySize == 12)
            {
                if("select".equals(tokens[0]) && "*".equals(tokens[1]) && "from".equals(tokens[2]) && "student".equals(tokens[3]) && "where".equals(tokens[4]) && "=".equals(tokens[6]))
                {
                    if("name".equals(tokens[5]))
                    {
                        if("and".equals(tokens[8]))
                        {
                            if("age".equals(tokens[9]) && "=".equals(tokens[10])) DisplaySpecificNaANDAg(tokens[7],Integer.parseInt(tokens[11]));
                            else if("city".equals(tokens[9]) && "=".equals(tokens[10])) DisplaySpecificNAANDCi(tokens[7],tokens[11]);
                        }
                        else if("or".equals(tokens[8]))
                        {
                            if("age".equals(tokens[9]) && "=".equals(tokens[10])) DisplaySpecificNaORAg(tokens[7],Integer.parseInt(tokens[11]));
                            else if("city".equals(tokens[9]) && "=".equals(tokens[10])) DisplaySpecificNaORCi(tokens[7],tokens[11]);
                        }
                    }
                }
            }
            else if(QuerySize == 7)
            {
                if("insert".equals(tokens[0]) && "into".equals(tokens[1]) && "student".equals(tokens[2]))
                    InsertData(tokens[3],Integer.parseInt(tokens[4]),Integer.parseInt(tokens[5]),tokens[6]);
                else if("delete".equals(tokens[0]) && "from".equals(tokens[1]) && "student".equals(tokens[2]) && "where".equals(tokens[3]))
                {
                    if("rid".equals(tokens[4]) && "=".equals(tokens[5])) DeleteSpecific(Integer.parseInt(tokens[6]));
                    else if("name".equals(tokens[4]) && "=".equals(tokens[5])) DeleteSpecific(tokens[6]);
                }
                else System.out.println("ERROR : Query is not correct");
            }
            else
            {
                System.out.println("ERROR : Query is not correct");
            }
        }
    }

    public void InsertData(String str, int value, int age, String str1)
    {
        Student sobj = new Student(str,value,age,str1);
        lobj.add(sobj);
        System.out.println("Query inserted successfully...");
    }

    public void Update(int rid, String name)
    {
        for(Student sref : lobj) if(sref.RID == rid) sref.Name = name;
        System.out.println("Query updated successfully...");
    }

    public void NUpdate(String Cname,String Uname)
    {
        for(Student sref : lobj) if(Cname.equals(sref.Name)) sref.Name = Uname;
        System.out.println("Query updated successfully...");
    }

    public void UpdateAge(int no1, int no2)
    {
        for(Student sref : lobj) if(sref.RID == no1) sref.Age = no2;
        System.out.println("Query updated successfully...");
    }

    public void UpdateCity(int no1, String str)
    {
        for(Student sref : lobj) if(sref.RID == no1) sref.City = str;
        System.out.println("Query updated successfully...");
    }

    public void DisplayAll()
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) sref.DisplayData();
    }

    public void DisplaySpecificRid(int rid)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if(sref.RID == rid) { sref.DisplayData(); break; }
    }

    public void DisplaySpecificAge(int age)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if(sref.Age == age) sref.DisplayData();
    }

    public void DisplaySpecificSalary(int salary)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if(sref.Salary == salary) sref.DisplayData();
    }

    public void DisplaySpecificName(String str)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if(str.equals(sref.Name)) sref.DisplayData();
    }

    public void LessSalary1(int no)
    {
        int iCount = 0;
        for(Student sref : lobj) if(sref.Salary < no) iCount++;
        System.out.println("-------------------------");
        System.out.printf("|\tCount(City)\t|\n");
        System.out.println("-------------------------");
        System.out.println("|\t"+iCount+"\t\t|");
        System.out.println("-------------------------");
    }

    public void LessSalaryDis2(int no)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if(sref.Salary <= no) sref.DisplayData();
    }

    public void LessRidDis(int no)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if(sref.RID < no) sref.DisplayData();
    }

    public void LessRidDis1(int no)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if(sref.RID <= no) sref.DisplayData();
    }

    public void MoreRidDis(int no)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if(sref.RID > no) sref.DisplayData();
    }

    public void MoreRidDis1(int no)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if(sref.RID >= no) sref.DisplayData();
    }

    public void LessAgeDis(int no)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if(sref.Age < no) sref.DisplayData();
    }

    public void LessAgeDis1(int no)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if(sref.Age <= no) sref.DisplayData();
    }

    public void MoreAgeDis(int no)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if(sref.Age > no) sref.DisplayData();
    }

    public void MoreAgeDis1(int no)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if(sref.Age >= no) sref.DisplayData();
    }

    public void LessSalaryDis(int no)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if(sref.Salary < no) sref.DisplayData();
    }

    public void MoreSalaryDis(int no)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if(sref.Salary > no) sref.DisplayData();
    }

    public void MoreSalaryDis1(int no)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if(sref.Salary >= no) sref.DisplayData();
    }

    public void BetweenSalaryDis(int no1, int no2)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if((sref.Salary <= no1)&&(sref.Salary >= no2)) sref.DisplayData();
    }

    public void BetweenAgeDis(int no1, int no2)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if((sref.Age <= no1)&&(sref.Age >= no2)) sref.DisplayData();
    }

    public void BetweenRIDDis(int no1, int no2)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if((sref.RID <= no1)&&(sref.RID >= no2)) sref.DisplayData();
    }

    public void DisplaySpecificCity(String str)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if(str.equals(sref.City)) sref.DisplayData();
    }

    public void DisplaySpecificNaANDAg(String str, int age)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if((str.equals(sref.Name)) && (sref.Age == age)) sref.DisplayData();
    }

    public void DisplaySpecificNAANDCi(String str, String city)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if((str.equals(sref.Name)) && (city.equals(sref.City))) sref.DisplayData();
    }

    public void DisplaySpecificNaORAg(String str, int age)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if((str.equals(sref.Name)) || (sref.Age == age)) sref.DisplayData();
    }

    public void DisplaySpecificNaORCi(String str, String city)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj) if((str.equals(sref.Name)) || (city.equals(sref.City))) sref.DisplayData();
    }

    public void DeleteSpecific(int rid)
    {
        int index = 0;
        for(Student sref : lobj)
        {
            if(sref.RID == rid)
            {
                lobj.remove(index);
                break;
            }
            index++;
        }
        System.out.println("Query deleted successfully...");
    }

    public void DeleteSpecific(String str)
    {
        int index = 0;
        for(Student sref : lobj)
        {
            if(str.equals(sref.Name))
            {
                lobj.remove(index);
                break;
            }
            index++;
        }
        System.out.println("Query deleted successfully...");
    }

    public void AggregateMax()
    {
        int iMax = 0;
        Student temp = null;
        for(Student sref : lobj)
        {
            if(sref.Salary > iMax)
            {
                iMax = sref.Salary;
                temp = sref;
            }
        }
        System.out.println("Information of student having maximum salary : ");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        temp.DisplayData();
    }

    public void AggregateMin()
    {
        int iMin = (lobj.getFirst()).Salary;
        Student temp = lobj.getFirst();
        for(Student sref : lobj)
        {
            if(sref.Salary < iMin)
            {
                iMin = sref.Salary;
                temp = sref;
            }
        }
        System.out.println("Information of student having minimum salary : ");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        temp.DisplayData();
    }

    public void AggregateSum()
    {
        long iSum = 0;
        for(Student sref : lobj) iSum = iSum + sref.Salary;
        System.out.println("-------------------------");
        System.out.printf("|\tSalary(sum)\t|\n");
        System.out.println("-------------------------");
        System.out.println("|\t"+iSum+"\t\t|");
        System.out.println("-------------------------");
    }

    public void AggregateAvg()
    {
        long iSum = 0;
        for(Student sref : lobj) iSum = iSum + sref.Salary;
        System.out.println("-------------------------");
        System.out.printf("|\tSalary(Avg)\t|\n");
        System.out.println("-------------------------");
        System.out.println("|\t"+iSum / (lobj.size())+"\t\t|");
        System.out.println("-------------------------");
    }

    public void AggregateCount()
    {
        System.out.println("-------------------------");
        System.out.printf("|\tCount(Record)\t|\n");
        System.out.println("-------------------------");
        System.out.println("|\t"+lobj.size()+"\t\t|");
        System.out.println("-------------------------");
    }

    public void CountCity(String city)
    {
        int iCount = 0;
        for(Student sref : lobj) if(city.equals(sref.City)) iCount++;
        System.out.println("-------------------------");
        System.out.printf("|\tCount(City)\t|\n");
        System.out.println("-------------------------");
        System.out.println("|\t"+iCount+"\t\t|");
        System.out.println("-------------------------");
    }
}

class CVDB
{
    public static void main(String arg[])
    {
        DBMS dobj = new DBMS();
        dobj.StartDBMS();
    }
}