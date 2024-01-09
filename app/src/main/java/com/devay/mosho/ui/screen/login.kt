package com.devay.mosho.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devay.mosho.R
import com.devay.mosho.ui.theme.MoshoTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "App Logo",
                    modifier = Modifier.size(150.dp)
                )
                Text(
                    text = "MOSHO", fontSize = 40.sp,
                    style = MaterialTheme.typography.displayLarge,
                    color = MaterialTheme.colorScheme.onBackground
                )
                Text(
                    text= "Discover Movies & TV Shows",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier.offset(y = (-15).dp)
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp)
                .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                .background(MaterialTheme.colorScheme.primary)
                .padding(horizontal = 30.dp, vertical = 20.dp)
        ) {
            Column {
                Text(
                    text = "Welcome",
                    style = MaterialTheme.typography.headlineLarge,
                    color = MaterialTheme.colorScheme.onPrimary,
                    fontSize = 40.sp
                )

                Text(
                    text = "Connect your trakt account to discover and track movies and tv shows.",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onPrimary,
                    modifier = Modifier.offset(y = (-10).dp)
                )

                Text(
                    text = "Your personal data never leaves your device.",
                    style = MaterialTheme.typography.headlineMedium,
                    color = MaterialTheme.colorScheme.onPrimary,
                    modifier = Modifier.offset(y = (-5).dp)
                )

                Spacer(modifier = Modifier.weight(1f))

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .clip(RoundedCornerShape(30.dp)),
                    elevation = CardDefaults.cardElevation(20.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xffffffff),
                        contentColor = Color.Black
                    ),
                    onClick = { /*TODO*/ }
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.trakt),
                            contentDescription = "Trakt Logo",
                            modifier = Modifier.padding(13.dp)
                        )

                        Text(
                            text = "Continue with Trakt",
                            style = MaterialTheme.typography.headlineLarge,
                        )

                        Spacer(modifier = Modifier.weight(1f))

                        Image(
                            painter = painterResource(id = R.drawable.arrow_right),
                            contentDescription = "Continue Arrow",
                            modifier = Modifier.padding(horizontal = 20.dp)
                        )

                    }
                }

                Spacer(modifier = Modifier.weight(1f))
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    MoshoTheme {
        LoginScreen()
    }
}