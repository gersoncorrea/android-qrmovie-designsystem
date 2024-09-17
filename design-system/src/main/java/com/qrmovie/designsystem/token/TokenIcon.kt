package com.qrmovie.designsystem.token

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.qrmovie.designsystem.R

@Immutable
object TokenIconRef {

    enum class IconType {
        Add, Search, Back, Calendar, Clock, Close, Compress, Done, Enlarge, ExpandArrow,
        Forward, ForwardArrow, Language, Location,
        Logout, Play, Sort
    }

    @Composable
    private fun getIconResource(iconType: IconType): Painter {

        return when (iconType) {
            IconType.Add -> painterResource(id = R.drawable.ic_add)
            IconType.Search -> painterResource(id = R.drawable.ic_search)
            IconType.Back -> painterResource(id = R.drawable.ic_back)
            IconType.Calendar -> painterResource(id = R.drawable.ic_calendar)
            IconType.Clock -> painterResource(id = R.drawable.ic_clock)
            IconType.Close -> painterResource(id = R.drawable.ic_close)
            IconType.Compress -> painterResource(id = R.drawable.ic_compress)
            IconType.Done -> painterResource(id = R.drawable.ic_done)
            IconType.Enlarge -> painterResource(id = R.drawable.ic_enlarge)
            IconType.ExpandArrow -> painterResource(id = R.drawable.ic_expand_arrow)
            IconType.Forward -> painterResource(id = R.drawable.ic_forward)
            IconType.ForwardArrow -> painterResource(id = R.drawable.ic_forward_arrow)
            IconType.Language -> painterResource(id = R.drawable.ic_language)
            IconType.Location -> painterResource(id = R.drawable.ic_location)
            IconType.Logout -> painterResource(id = R.drawable.ic_logout)
            IconType.Play -> painterResource(id = R.drawable.ic_play)
            IconType.Sort -> painterResource(id = R.drawable.ic_sort)
        }
    }

    @Composable
    fun getIcon(iconType: IconType): Painter {
        return getIconResource(iconType)
    }
}
