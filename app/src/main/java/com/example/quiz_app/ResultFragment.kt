package com.example.quiz_app

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.result_fagment.*


class ResultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.result_fagment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val username = Constants.USER_NAME
        tv_name.text = username

        val toalQuestions = Constants.TOTAL_QUESTION
        val correctAnswers = Constants.CORRECT_ANSWERS

        tv_score.text = "Your score is $correctAnswers out of $toalQuestions"

        btn_finish.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.navigateToMainFragment)
        }
    }

}