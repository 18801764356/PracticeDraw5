package demo.wj.practicedraw5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var pageModels: MutableList<PageModel> = arrayListOf(
        PageModel(
            R.layout.sample_after_on_draw,
            R.string.title_after_on_draw,
            R.layout.practice_after_on_draw
        ),
        PageModel(
            R.layout.sample_before_on_draw,
            R.string.title_before_on_draw,
            R.layout.practice_before_on_draw
        ),
        PageModel(
            R.layout.sample_on_draw_layout,
            R.string.title_on_draw_layout,
            R.layout.practice_on_draw_layout
        ),
        PageModel(
            R.layout.sample_dispatch_draw,
            R.string.title_dispatch_draw,
            R.layout.practice_dispatch_draw
        ),
        PageModel(
            R.layout.sample_after_on_draw_foreground,
            R.string.title_after_on_draw_foreground,
            R.layout.practice_after_on_draw_foreground
        ),
        PageModel(
            R.layout.sample_before_on_draw_foreground,
            R.string.title_before_on_draw_foreground,
            R.layout.practice_before_on_draw_foreground
        ),
        PageModel(
            R.layout.sample_after_draw,
            R.string.title_after_draw,
            R.layout.practice_after_draw
        ),
        PageModel(
            R.layout.sample_before_draw,
            R.string.title_before_draw,
            R.layout.practice_before_draw
        )
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewpager.setAdapter(object : FragmentPagerAdapter(supportFragmentManager) {

            override fun getItem(position: Int): Fragment {
                val pageModel = pageModels.get(position)
                return PageFragment.newInstance(
                    pageModel.sampleLayoutRes,
                    pageModel.practiceLayoutRes
                )
            }

            override fun getCount(): Int {
                return pageModels.size
            }

            override fun getPageTitle(position: Int): CharSequence? {
                return getString(pageModels[position].titleRea)
            }
        })
        tablayout.setupWithViewPager(viewpager)
    }

}
