// Ques 8  Combine content of all the files in a specific directory to another new file

def dst = new File('/home/puneet/exercise/test1.txt')
new File("/home/puneet/exercise/test").eachFileRecurse { file ->
    dst<<(file.getText())
}

