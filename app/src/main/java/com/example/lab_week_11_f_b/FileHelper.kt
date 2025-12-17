package com.example.lab_week_11_f_b

import android.content.Context
import android.net.Uri
import android.os.Environment
import androidx.core.content.FileProvider
import java.io.File

class FileHelper(private val context: Context) {

    fun getUriFromFile(file: File): Uri {
        return FileProvider.getUriForFile(
            context,
            "com.example.lab_week_11_f_b.camera",
            file
        )
    }

    fun getPicturesFolder(): String {
        return Environment.DIRECTORY_PICTURES
    }

    fun getVideosFolder(): String {
        return Environment.DIRECTORY_MOVIES
    }
}
