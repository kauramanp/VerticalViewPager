package com.aman.verticalviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.aman.verticalviewpager.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity(), ItemClick {
    lateinit var binding: ActivityMainBinding
    var arrayList = arrayListOf<ViewpagerObject>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        arrayList.add(ViewpagerObject(
            "https://post.healthline.com/wp-content/uploads/2020/09/AN313-Tomatoes-732x549-Thumb-732x549.jpg",
            "Tomato",
            "Tomatoes are a fruit.\nAnd they are the most popular fruit in the whole world!"
        ))
        arrayList.add(ViewpagerObject(
            "https://www.macmillandictionary.com/external/slideshow/full/160279_full.jpg",
            "Strawberries",
            "Strawberries are technically not a berry.\n" +
                    "Weird but true!\n" +
                    "Berries by definition have their seeds on the inside, whilst strawberries hold their 200 seeds on the outside."
        ))
        arrayList.add(ViewpagerObject(
            "https://www.simplyrecipes.com/thmb/FPv4xdsPSGRseeU0-wuKdFp1vNE=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/__opt__aboutcom__coeus__resources__content_migration__simply_recipes__uploads__2013__11__how-to-cut-pomegranate-horiz-a-1800-81c587bf93ab48bfb9ea7afea4d76c4c.jpg",
            "Pomegranate",
            "A pomegranate can hold up to 1000 seeds!" ))
        arrayList.add(ViewpagerObject(
            "https://cdn.mos.cms.futurecdn.net/iC7HBvohbJqExqvbKcV3pP.jpg",
            "Potatoes",
            "Potatoes were the first vegetable to be grown in space" ))
        binding.viewPager.adapter = ImageAdapter(this, arrayList, this)
    }

    override fun onClick(item: Int) {

    }
}