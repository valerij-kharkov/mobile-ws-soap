package ua.com.cs.helpers;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.*;

/**
 * Created by valeriy_solyanik
 * on 15.12.2015.
 */
public class ZipHelper {

	/**
	 * Кодировка данных с которыми будет работать класс
	 */
	private String encoding;

	public ZipHelper(String encoding) {
		this.encoding = encoding;
	}


	/**
	 * Сжатие данных в формате GZIP
	 *
	 * @param s String - данные для сжатия
	 * @return byte[] - сжатые данные в виде массива байт
	 * @throws IOException исключение при выполнении операции
	 */
	public byte[] CompressGZIP(String s) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		GZIPOutputStream zip = new GZIPOutputStream(bos);
		Writer w = new OutputStreamWriter(zip, encoding);
		w.write(s);
		w.flush();
		zip.finish();
		w.close();
		return bos.toByteArray();
	}

	/**
	 * Распаковка данных в формате GZIP
	 *
	 * @param data byte[] - данные для распаковки в виде массива байт
	 * @return String - распакованная строка
	 * @throws IOException исключение при выполнении операции
	 */
	public String DecompressGZIP(byte[] data) throws IOException {
		GZIPInputStream zip = new GZIPInputStream(new ByteArrayInputStream(data));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int iOneByte = 0;
		while (zip.available() == 1) {
			iOneByte = zip.read();
			if (iOneByte != -1) {
				baos.write(iOneByte);
			}
		}
		baos.close();
		return new String(baos.toByteArray(), encoding);
	}

}