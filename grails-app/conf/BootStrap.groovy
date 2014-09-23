import com.hg.*

class BootStrap {

    def init = { servletContext ->
        new Quest(name: 'Seek the Grail')
        .addToTasks(name:'Run Away', priority:3)
        .addToTasks(name:'Answer the bridge keeper', priority:5)
        .save()
    }
    def destroy = {
    }
}
