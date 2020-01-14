package dev.yavuztas.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Solution for a function that provides change directory (cd) function for an
 * abstract file system.
 * 
 * @author Yavuz Tas
 */
public class Path {

	private String path;
	private List<String> folders;
	private int currentFolderLevel = 0;

	public Path(String path) {
		this.path = path;
		this.createPath(path);
	}

	public String getPath() {
		return path;
	}

	public void cd(String newPath) {

		if (newPath.equals("/")) {
			this.path = "/";
			return;
		}

		if (newPath.equals(".") || newPath.equals("./")) {
			return;
		}

		if (newPath.equals("..") || newPath.equals("../")) {
			this.folders.remove(currentFolderLevel);
			this.currentFolderLevel = this.folders.size() - 1;
			this.path = String.join("/", folders);
			return;
		}

		String cleared = newPath.replaceAll("[\\./]", "");
		if (!cleared.isEmpty() && !cleared.matches("[A-Za-z]+")) {
			return;
		}

		if (newPath.startsWith("/")) {
			createPath(newPath);
			this.path = String.join("/", folders);
			return;
		}

		if (newPath.startsWith("../")) {
			this.folders.remove(currentFolderLevel);
			appendPath(newPath.substring(3));
			this.path = String.join("/", folders);
			return;
		}

		if (newPath.startsWith("./")) {
			appendPath(newPath.substring(2));
			this.path = String.join("/", folders);
		} else {
			appendPath(newPath);
			this.path = String.join("/", folders);
		}

	}

	public void createPath(String clearPath) {
		this.folders = new ArrayList<>(Arrays.asList(clearPath.split("/")));
		this.currentFolderLevel = this.folders.size() - 1;
	}

	public void appendPath(String clearPath) {
		List<String> names = new ArrayList<>(Arrays.asList(clearPath.split("/")));
		for (String name : names) {
			if (name.equals(".")) {
				continue;
			}
			if (name.equals("..")) {
				this.folders.remove(this.folders.size() - 1);
			} else {
				this.folders.add(name);
			}
		}
		this.currentFolderLevel = this.folders.size() - 1;
	}

	public static void main(String[] args) {
		Path path = new Path("/a/b/c/d");
		path.cd("../x");
		System.out.println(path.getPath());
	}
}