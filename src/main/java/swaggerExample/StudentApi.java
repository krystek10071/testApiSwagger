package swaggerExample;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentApi {

    private List<Student> studentsList;

    public StudentApi(){
        this.studentsList=new ArrayList<>();
    }

    @ApiOperation(
            value = "this is value", notes = "this is notes"
    )
    @GetMapping("/{id}")
    public Student getStudents( @PathVariable int id){
        return studentsList.stream()
                .filter(student -> student.getId() == id).findFirst().get();
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentsList;
    }

    @PostMapping
    public boolean addStudent(@RequestBody Student student){
        return  studentsList.add(student);
    }

}
