package com.iteratrlearning.shu_book.chapter;

import java.io.File;
import java.io.IOException;


interface Importer {
	Document importFile(File file) throws IOException;
}
