package ch.deletescape.lawnchair.ui.preferences

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.android.launcher3.R

@Composable
fun AppDrawerPreferences(interactor: PreferenceInteractor) {
    Column {
        PreferenceGroup {
            SliderPreference(
                label = stringResource(id = R.string.app_drawer_columns),
                value = interactor.allAppsColumns.value,
                onValueChange = { interactor.setAllAppsColumns(it) },
                steps = 3,
                valueRange = 3.0F..7.0F
            )
        }
    }
}