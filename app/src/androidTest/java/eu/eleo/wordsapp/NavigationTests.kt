package eu.eleo.wordsapp

import androidx.navigation.testing.TestNavHostController
import androidx.test.core.app.ApplicationProvider
import androidx.test.runner.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NavigationTests {

    @Test
    fun navigate_to_words_nav_component() {
        val navController = TestNavHostController(
            ApplicationProvider.getApplicationContext()
        )
        val letterListScenario = launchFragmentInContainer<LetterListFragment>(
            themeResId =
            R.style.Theme_Words
        )
    }

}