/*
Copyright (C) 2011-2020 Maksim Petrov

Redistribution and use in source and binary forms, with or without
modification, are permitted for the widgets, plugins, applications and other software
which communicate with Poweramp application on Android platform.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
``AS IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE FOUNDATION OR
CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package com.maxmpz.poweramp.player;

/**
 * Constants used for Poweramp Track Provider API
 */
public class TrackProviderConsts {
	/**
	 * Column for optional album artist tag.<br>
	 * String
	 */
	public static final String COLUMN_ALBUM_ARTIST = "album_artist";

	/**
	 * Column for optional genre tag<br>
	 * String
	 */
	public static final String COLUMN_GENRE = "genre";

	/**
	 * Column for optional bits per sample tag<br>
	 * Integer
	 */
	public static final String COLUMN_BITS_PER_SAMPLE = "bits_per_sample";

	/**
	 * Column for http track url<br>
	 * String
	 */
	public static final String COLUMN_URL = "url";

	/**
	 * Column for optional lyrics<br>
	 * String
	 */
	public static final String COLUMN_TRACK_LYRICS = "lyrics";

	/**
	 * Column for track wave<br>
	 * float[] array of size 0..100 saved as bytes, if size == 0 no further attempt to scan track wave will happen.
	 */
	public static final String COLUMN_TRACK_WAVE = "track_wave";

	/**
	 * Column for {@link #CALL_GET_URL} call result bundle. Sets/overrides headers. This is single string with headers separated by \r\n, e.g.:<br>
	 * "Debug-header1: some header value\r\nDebug-header2: another header value\r\n"
	 */
	public static final String COLUMN_HEADERS = "headers";

	/**
	 * Column for {@link #CALL_GET_URL} call result bundle. Sets cookies for the request. This is single string with cookies separated by \n, e.g.:<br>
	 * "cookie1=value1; Secure\ncookie2=value; SameSite=Strict"
	 */
	public static final String COLUMN_COOKIES = "cookies";

	/**
	 * Column for {@link #CALL_GET_URL} call result bundle. Sets method for http request, e.g. POST
	 */
	public static final String COLUMN_HTTP_METHOD = "method";

	/**
	 * Special value for #COLUMN_URL to use with dynamic url - an url which is dynamically retrieved at the moment of playback with #CALL_GET_URL
	 */
	public static final String DYNAMIC_URL = "__dynamic_url";

	/**
	 * Method name for DocumentProvider.call - used to retrieve actual dynamic url for given track
	 */
	public static final String CALL_GET_URL = "com.maxmpz.audioplayer:get_url";

	/**
	 * Method name for DocumentProvider.call - informs provider regarding automatic or user initiated scan.<br>
	 * This is called prior Poweramp calls any {@link android.provider.DocumentsProvider#queryChildDocuments} and other methods to rescan the actual files hierarchy and metadata.<br><br>
	 *
	 * Depending on ths passed arguments, provider may do some refresh on data - if absolutely needed. Poweramp (and user) waits until this method returns, so in most cases,
	 * it should return as soon as possible.<br><br>
	 *
	 * The provided extras bundle contains the same arguments as passed to Poweramp scanner in the request. See {@link PowerampAPI.Scanner} extras for the details.
	 */
	public static final String CALL_RESCAN = "com.maxmpz.audioplayer:rescan";
}
