/*
 * ftp4j - A pure Java FTP client library
 * 
 * Copyright (C) 2008-2010 Carlo Pelliccia (www.sauronsoftware.it)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version
 * 2.1, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License 2.1 for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License version 2.1 along with this program.
 * If not, see <http://www.gnu.org/licenses/>.
 */
package JFTP;

/**
 * Exception thrown if any I/O error occurs during a data transfer attempt.
 * 
 * @author Carlo Pelliccia
 */
public class FTPDataTransferException extends Exception {

	private static final long serialVersionUID = 1L;

	public FTPDataTransferException() {
		super();
	}

	public FTPDataTransferException(String message, Throwable cause) {
		super(message, cause);
	}

	public FTPDataTransferException(String message) {
		super(message);
	}

	public FTPDataTransferException(Throwable cause) {
		super(cause);
	}

}
