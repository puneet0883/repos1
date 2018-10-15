import groovy.transform.ToString

@ToString
class Person2
{
    String name
    int age
    String location
    String address
    //List<Add2> fields
}

@ToString
class Add2 extends Person2
{
    int empId
    String company
    int salary
}
Person2 add2 = new Add2()
add2.setName("puneet")
add2.setAge(23)
add2.setLocation("faridabad")
add2.setAddress("Logic Tech Park")
add2.setEmpId(3037)
add2.setCompany("TotheNew")
add2.setSalary(15000)

println "${add2.name} is a man aged ${add2.age} who lives at ${add2.location}. He works for ${add2.company} with employee id ${add2.empId} and draws ${add2.salary} lots of money !!!!."
