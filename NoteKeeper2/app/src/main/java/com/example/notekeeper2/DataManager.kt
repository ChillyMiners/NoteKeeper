package com.example.notekeeper2

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses(){
        var course = CourseInfo("android_intents", "Android programming with intents")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "android_async", title = "Android Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses.set(course.courseId, course)
    }

    private fun initializeNotes(){
        notes.add(NoteInfo(courses.get("java_core")!!,
            "This is the title", "This is the text"))

        notes.add(NoteInfo(courses.get("java_lang")!!,
            "Que?", "No me habla ingles"))

        notes.add(NoteInfo(courses.get("android_intents")!!,
            "Bollocks", "Still don't get why these are a thing tbh"))

        notes.add(NoteInfo(courses.get("android_async")!!,
            "Yoo Wot", "Ain't even touched on this'n yet"))
    }
}