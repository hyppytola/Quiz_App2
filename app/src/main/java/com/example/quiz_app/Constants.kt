package com.example.quiz_app

object Constants{

    var USER_NAME: String = "user_name"
    var TOTAL_QUESTION: String = "total_question"
    var CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(1,
            "How many triangles in the picture below?",
            R.drawable.first_trg,
            7,
            6,
            8,
            4,
            1)

        questionsList.add(que1)

        val que2 = Question(2,
            "How many triangles in the picture below?",
            R.drawable.second_trg,
            34,
            37,
            35,
            38,
            3)

        questionsList.add(que2)

        val que3 = Question(3,
            "How many triangles in the picture below?",
            R.drawable.third_trg,
            27,
            26,
            28,
            24,
            4)

        questionsList.add(que3)

        val que4 = Question(4,
            "How many triangles in the picture below?",
            R.drawable.forth_trg,
            7,
            6,
            8,
            4,
            3)

        questionsList.add(que4)

        val que5 = Question(5,
            "How many triangles in the picture below?",
            R.drawable.fifth_trg,
            47,
            46,
            48,
            44,
            1)

        questionsList.add(que5)

        val que6 = Question(6,
            "How many triangles in the picture below?",
            R.drawable.sixth_trg,
            17,
            27,
            28,
            20,
            2)

        questionsList.add(que6)

        val que7 = Question(7,
            "How many triangles in the picture below?",
            R.drawable.seventh_trg,
            27,
            26,
            28,
            24,
            3)

        questionsList.add(que7)

        val que8 = Question(8,
            "How many triangles in the picture below?",
            R.drawable.eighth_trg,
            67,
            66,
            58,
            64,
            4)

        questionsList.add(que8)

        val que9 = Question(9,
            "How many triangles in the picture below?",
            R.drawable.nineth_trg,
            7,
            10,
            8,
            9,
            2)

        questionsList.add(que9)

        val que10 = Question(10,
            "How many triangles in the picture below?",
            R.drawable.tenth_trg,
            7,
            6,
            8,
            4,
            2)

        questionsList.add(que10)
        return questionsList
    }
}