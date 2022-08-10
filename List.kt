fun main() {
    
    // Read-only (immutable)
    val names = listOf("Ahad", "Turki", "Raghad", "Nasser", "Sumayah", "Fahdah")
    val namesAll = listOf("Ahad", "Turki", "Raghad", "Nasser")
    val color = listOf<String>()
    
    // Read and Write (mutable)
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val weekDays = mutableListOf("Sun", "Mon", "Tue", "Wed", "Thurs", "Fri", "Sat")
    val weekendDays = mutableListOf("Fri" , "Sat")

    
    // Read-Write (mutable) List - Operations
    
    
    // Add (Element)
   println("before add: $numbers") 
   numbers.add("sex")
   println("after add: $numbers") 
   println("=================================") 
   	
    // Add (Index, Element)
   	println("before add: $numbers") 
    numbers.add(6 , "seven")
    println("after add: $numbers") 
    println("=================================") 
   
    // Add All (List)
    println("before add All list: $numbers") 
    numbers.addAll(weekDays)
    println("after add All list: $numbers") 
    println("=================================") 
    // Add All (Index, List)
    println("before add All list: $numbers") 
    numbers.addAll(7 , weekDays)
    println("after add All list: $numbers") 
    println("=================================") 
    // Clear 
    println("before clear: $numbers") 
    numbers.clear()
    println("after clear: $numbers") 
    println("=================================") 
   	
    // Remove
    println("before remove element: $weekDays") 
    weekDays.remove("Mon")
    println("after remove element: $weekDays") 
    println("=================================") 
    // Remove At 
    println("before remove index: $weekDays") 
    weekDays.removeAt(0)
    println("after remove index: $weekDays") 
    println("=================================") 
    
    // Remove All
   	 println("before remove list: $weekDays") 
     weekDays.removeAll(weekendDays)
     println("after remove list: $weekDays") 
     println("=================================") 
    
    // Read-only (immutable) List - Operations
     
     
    // The size of the list
     println("the size name list : ${names.size}")
     println("=================================")
    // Contains
   	println(" name ?? ${names.contains("Nasser")}")
    println(names)
    println("=================================")
    // Contains All
    println(" namesAll?? ${names.containsAll(namesAll)}")
    println(namesAll)
    println(names)
    println("=================================")
   	
    // get
   println(names) 
   println("index 4 : ${names.get(4)}") 
   println("=================================")
   	
    // indexOf
   println(names) 
   println("index for element Nasser : ${names.indexOf("Nasser")}") 
   println("=================================")
    // isEmpty
    println(names)
    println("empty?? ${names.isEmpty()}")
    println("=================================")
    
    println(color)
    println("empty?? ${color.isEmpty()}")
    println("=================================")
    
    // Sublist
    println(" sublist: ${names.subList(0,4)}")
    
   
}
