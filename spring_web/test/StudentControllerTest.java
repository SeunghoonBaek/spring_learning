import idv.bsh.web.StudentController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by baek on 2017. 7. 20..
 */
public class StudentControllerTest {

    private StudentController controller;

    @Before
    public void setUp(){
        controller = new StudentController();
    }

    @Test
    public void welcomeTest() throws Exception{
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/"))
                .andExpect(view().name("redirect:/student"));
    }

    @Test
    public void studentTest() throws Exception{
        MockMvc mockMvc = standaloneSetup(controller)
                .setSingleView(new InternalResourceView("/WEB-INF/jsp/student.jsp"))
                .build();

        mockMvc.perform(get("/student"))
                .andExpect(view().name("student"));
    }

    @Test
    public void addStudentTest() throws Exception{
        MockMvc mockMvc = standaloneSetup(controller)
                .setSingleView(new InternalResourceView("/WEB-INF/jsp/result.jsp"))
                .build();

        mockMvc.perform(post("/addStudent?name=lineplus&age=10&id=20"))
                .andExpect(view().name("result"))
                .andExpect(model().attributeExists("name"))
                .andExpect(model().attributeExists("age"))
                .andExpect(model().attributeExists("id"));
    }
}
