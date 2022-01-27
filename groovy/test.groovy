class Example {
   static void main(String[] args) {
      try {
         def arr = new int[3];
         arr[1] = 5;
         println(arr);
      // }catch(ArrayIndexOutOfBoundsException ex) {
      //    println("Catching the Array out of Bounds exception");
      }catch(Exception e) {
      //    println("Catching the exception");
         println(e.getMessage());
      // }
		
      // println("Let's move on after the exception");
      }finally {
         println(" this is the finally block so  must display !!")
      }
   } 
}
