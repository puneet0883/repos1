// Ques 11  Make copy of an image type file byte by byte


def src = new File("/home/puneet/exercise/index.jpeg").readBytes()
new File('/home/puneet/exercise/write').append(src)


