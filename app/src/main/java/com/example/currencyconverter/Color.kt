package com.example.currencyconverter


import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Material3 Light Colors
val light_primary = Color(0xFF006B5F)
val light_onPrimary = Color(0xFFFFFFFF)
val light_primaryContainer = Color(0xFF75F8E3)
val light_onPrimaryContainer = Color(0xFF00201C)
val light_secondary = Color(0xFF076D36)
val light_onSecondary = Color(0xFFFFFFFF)
val light_secondaryContainer = Color(0xFF9DF6B1)
val light_onSecondaryContainer = Color(0xFF00210C)
val light_tertiary = Color(0xFF8A5100)
val light_onTertiary = Color(0xFFFFFFFF)
val light_tertiaryContainer = Color(0xFFFFDCBE)
val light_onTertiaryContainer = Color(0xFF2C1600)
val light_error = Color(0xFFBA1A1A)
val light_errorContainer = Color(0xFFFFDAD6)
val light_onError = Color(0xFFFFFFFF)
val light_onErrorContainer = Color(0xFF410002)
val light_background = Color(0xFFF8FDFF)
val light_onBackground = Color(0xFF001F25)
val light_surface = Color(0xFFF8FDFF)
val light_onSurface = Color(0xFF001F25)
val light_surfaceVariant = Color(0xFFDAE5E1)
val light_onSurfaceVariant = Color(0xFF3F4946)
val light_outline = Color(0xFF6F7976)
val light_inverseOnSurface = Color(0xFFD6F6FF)
val light_inverseSurface = Color(0xFF00363F)
val light_inversePrimary = Color(0xFF54DBC8)
val light_shadow = Color(0xFF000000)
val light_surfaceTint = Color(0xFF006B5F)
val light_outlineVariant = Color(0xFFBEC9C5)
val light_scrim = Color(0xFF000000)

// Material3 Dark Colors
val dark_primary = Color(0xFF54DBC8)
val dark_onPrimary = Color(0xFF003731)
val dark_primaryContainer = Color(0xFF005047)
val dark_onPrimaryContainer = Color(0xFF75F8E3)
val dark_secondary = Color(0xFF81D997)
val dark_onSecondary = Color(0xFF003919)
val dark_secondaryContainer = Color(0xFF005227)
val dark_onSecondaryContainer = Color(0xFF9DF6B1)
val dark_tertiary = Color(0xFFFFB86F)
val dark_onTertiary = Color(0xFF4A2800)
val dark_tertiaryContainer = Color(0xFF693C00)
val dark_onTertiaryContainer = Color(0xFFFFDCBE)
val dark_error = Color(0xFFFFB4AB)
val dark_errorContainer = Color(0xFF93000A)
val dark_onError = Color(0xFF690005)
val dark_onErrorContainer = Color(0xFFFFDAD6)
val dark_background = Color(0xFF001F25)
val dark_onBackground = Color(0xFFA6EEFF)
val dark_surface = Color(0xFF001F25)
val dark_onSurface = Color(0xFFA6EEFF)
val dark_surfaceVariant = Color(0xFF3F4946)
val dark_onSurfaceVariant = Color(0xFFBEC9C5)
val dark_outline = Color(0xFF899390)
val dark_inverseOnSurface = Color(0xFF001F25)
val dark_inverseSurface = Color(0xFFA6EEFF)
val dark_inversePrimary = Color(0xFF006B5F)
val dark_shadow = Color(0xFF000000)
val dark_surfaceTint = Color(0xFF54DBC8)
val dark_outlineVariant = Color(0xFF3F4946)
val dark_scrim = Color(0xFF000000)

val seed = Color(0xFF008577)

// App specific color definitions
val SystemGrey_Dark = Color(0xFF8E8E93)
val ModalScrimColor = Color(0x90000000)

@Composable
fun getStatusBarColor(): Color =
    MaterialTheme.colorScheme.surface

@Composable
fun getNavigationBarColor(): Color =
    MaterialTheme.colorScheme.surface
