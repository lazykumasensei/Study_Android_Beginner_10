package com.myapp.androidbeginner

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.f_main.*

class MainFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.f_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fMain_toolbar.text = "메인 페이지"
        fMain_text.text = "안녕하세요~\n메인 페이지입니다\n 텍스트를 눌러주세요"
        fMain_text.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_detailFragment)
        }
    }
}