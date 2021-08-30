package com.covirtue.jetpackcompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
import com.covirtue.jetpackcompose.ui.theme.Shapes
import com.covirtue.jetpackcompose.ui.theme.primary
import com.covirtue.jetpackcompose.ui.theme.text
import com.covirtue.jetpackcompose.ui.theme.typography

@Composable
fun ItemBookList() {
    Card(modifier = Modifier.background(MaterialTheme.colors.onSurface).padding(16.dp)) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = rememberImagePainter(
                    data = "https://s3.amazonaws.com/AKIAJC5RLADLUMVRPFDQ.book-thumb-images/ableson.jpg",
                ),
                contentDescription = null,
                modifier = Modifier.size(98.dp, 145.dp).padding(12.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(text = "by Bello Abdulrouf", style = typography.caption, color = text.copy(0.7F))
                Spacer(modifier = Modifier.height(12.dp))
                Text(text = "The more of less", style = typography.subtitle1, color = text.copy(0.7F))
                Spacer(modifier = Modifier.height(8.dp))
                ChipView()
            }
        }
    }
}

@Composable
fun ChipView() {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .background(color = primary.copy(.10F))
            .padding(start = 12.dp, end = 12.dp, top = 5.dp, bottom = 5.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Minimalism", style = typography.caption, color = primary)
    }
}

@Preview
@Composable
fun ItemBookListPreview() {
    ItemBookList()
}