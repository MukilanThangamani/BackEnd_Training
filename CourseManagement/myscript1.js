function enrollStudents(){
    
        fetch("http://localhost:8080/course/registered")
        .then((response)=>response.json())
        .then((students)=>{
      
         
           const dataTable = document.getElementById("enrolltable")
          students.forEach(student=>{
              var row = `<tr>
              <td>${student.name}</td>
              <td>${student.emailId}</td>
              <td>${student.courseName}</td>
              </tr>`
      
              dataTable.innerHTML+=row;
          })  
        })
}