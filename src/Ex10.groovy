// Ques 10  Write a method which removes all the white spaces in a file and writes the output to another file.
//          Suppose white space characters are Space, Tab and Enter

def a=new File("/home/puneet/exercise/test.txt").eachLine ({line-> line.replaceAll("\\s","")})
new File("/home/puneet/exercise/Writing").append(a)

