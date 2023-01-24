import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Board {
	ArrayList<ArrayList<String>> table = new ArrayList<ArrayList<String>>();
	private final int NUM_OF_COLUMNS = 7;
	private final int NUM_OF_ROW = 6;
	
	/* 
	 * The board object must contain the board state in some manner.
	 * You must decide how you will do this.
	 * 
	 * You may add addition private/public methods to this class is you wish.
	 * However, you should use best OO practices. That is, you should not expose
	 * how the board is being implemented to other classes. Specifically, the
	 * Player classes.
	 * 
	 * You may add private and public methods if you wish. In fact, to achieve
	 * what the assignment is asking, you'll have to
	 * 
	 */
	
	public Board() {
		ArrayList<String> l1 = new ArrayList<String>();
		ArrayList<String> l2 = new ArrayList<String>();
		ArrayList<String> l3 = new ArrayList<String>();
		ArrayList<String> l4 = new ArrayList<String>();
		ArrayList<String> l5 = new ArrayList<String>();
		ArrayList<String> l6 = new ArrayList<String>();
		for(int i = 0; i < 15;i++){
			if(i % 2 == 0){
				l1.add("|");
			}
			else{
				l1.add("_");
			}
		}
		for(int i = 0; i < 15;i++){
			if(i % 2 == 0){
				l2.add("|");
			}
			else{
				l2.add("_");
			}
		}
		for(int i = 0; i < 15;i++){
			if(i % 2 == 0){
				l3.add("|");
			}
			else{
				l3.add("_");
			}
		}
		for(int i = 0; i < 15;i++){
			if(i % 2 == 0){
				l4.add("|");
			}
			else{
				l4.add("_");
			}
		}
		for(int i = 0; i < 15;i++){
			if(i % 2 == 0){
				l5.add("|");
			}
			else{
				l5.add("_");
			}
		}
		for(int i = 0; i < 15;i++){
			if(i % 2 == 0){
				l6.add("|");
			}
			else{
				l6.add("_");
			}
		}
		table.add(l1);
		table.add(l2);
		table.add(l3);
		table.add(l4);
		table.add(l5);
		table.add(l6);

	}
	
	public void printBoard() {
		for(ArrayList i : table){
			for(int o = 0; o < 15; o++){
				System.out.print(i.get(o));
			}
			System.out.println("");
		}

	}
	
	public boolean containsWin() {
		for(int i = 0; i < 6; i++){
			for(int o = 1; o < 5;o++){
				if(table.get(i).get(2*o-1).equals(table.get(i).get(2*o+1)) && table.get(i).get(2*o-1).equals(table.get(i).get(2*o+3)) && table.get(i).get(2*o-1).equals(table.get(i).get(2*o+5)) && table.get(i).get(2*o-1) != "_"){
					return true;
				}
			}
		}
		for(int i = 0; i < 3;i++){
			for(int o = 1; o < 8;o++){
				if(table.get(i).get(2*o-1).equals(table.get(i+1).get(2*o-1)) && table.get(i).get(2*o-1).equals(table.get(i+2).get(2*o-1)) && table.get(i).get(2*o-1).equals(table.get(i+3).get(2*o-1)) && table.get(i).get(2*o-1) != "_"){
					return true;
				}
			}
		}
		for(int i = 0; i < 3;i++){
			for(int o = 1; o < 5;o++){
				if(table.get(i).get(2*o-1).equals(table.get(i+1).get(2*o+1)) && table.get(i).get(2*o-1).equals(table.get(i+2).get(2*o+3)) && table.get(i).get(2*o-1).equals(table.get(i+3).get(2*o+5)) && table.get(i).get(2*o-1) != "_"){
					return true;
				}
			}
		}
		for(int i = 0; i < 3;i++){
			for(int o = 4; o < 8;o++){
				if(table.get(i).get(2*o-1).equals(table.get(i+1).get(2*o-3)) && table.get(i).get(2*o-1).equals(table.get(i+2).get(2*o-5)) && table.get(i).get(2*o-1).equals(table.get(i+3).get(2*o-7)) && table.get(i).get(2*o-1) != "_"){
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean isTie() {
		int counter = 0;
		for(int i = 0; i < 6; i++){
			for(int o = 0; o < 15;o++){
				if(table.get(i).get(o) == "_"){
					counter += 1;
				}
			}
		}
		if(counter == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void reset() {
		table.clear();
		ArrayList<String> l1 = new ArrayList<String>();
		ArrayList<String> l2 = new ArrayList<String>();
		ArrayList<String> l3 = new ArrayList<String>();
		ArrayList<String> l4 = new ArrayList<String>();
		ArrayList<String> l5 = new ArrayList<String>();
		ArrayList<String> l6 = new ArrayList<String>();
		for(int i = 0; i < 15;i++){
			if(i % 2 == 0){
				l1.add("|");
			}
			else{
				l1.add("_");
			}
		}
		for(int i = 0; i < 15;i++){
			if(i % 2 == 0){
				l2.add("|");
			}
			else{
				l2.add("_");
			}
		}
		for(int i = 0; i < 15;i++){
			if(i % 2 == 0){
				l3.add("|");
			}
			else{
				l3.add("_");
			}
		}
		for(int i = 0; i < 15;i++){
			if(i % 2 == 0){
				l4.add("|");
			}
			else{
				l4.add("_");
			}
		}
		for(int i = 0; i < 15;i++){
			if(i % 2 == 0){
				l5.add("|");
			}
			else{
				l5.add("_");
			}
		}
		for(int i = 0; i < 15;i++){
			if(i % 2 == 0){
				l6.add("|");
			}
			else{
				l6.add("_");
			}
		}
		table.add(l1);
		table.add(l2);
		table.add(l3);
		table.add(l4);
		table.add(l5);
		table.add(l6);
	}
	public void Move(Board board,char symbol, String name) {
		Scanner num = new Scanner(System.in);
		int move = 0;
		while((move < 1 || move > 7) ){
			System.out.print(name + ", please input your move: ");
			move =  num.nextInt();
			if( move < 1 || move > 7 ){
				move = 0;
			}
			else if(board.table.get(0).get(move + move - 1) != "_"){
				move = 0;
			}
		}
		for(int i = 5; i > -1;i--){
			if(board.table.get(i).get(move + move - 1) == "_"){
				board.table.get(i).set(move + move - 1, String.valueOf(symbol));
				i = 0;
			}
			else{
				continue;
			}
		}
	}
	public void AImove(Board board,char symbol, String name) {
		for (int i = 5; i > -1; i--) {
			if (table.get(i).get(1) == "_" && table.get(i).get(3).equals(String.valueOf(symbol)) && table.get(i).get(5).equals(String.valueOf(symbol))&& table.get(i).get(7).equals(String.valueOf(symbol))) {
				if(i == 5) {
					table.get(i).set(1, String.valueOf(symbol));
					return;
				}
				else{
					if(table.get(i+1).get(1) != "_"){
						table.get(i).set(1, String.valueOf(symbol));
						return;
					}
				}
			}
			else if (table.get(i).get(3) == "_" && table.get(i).get(5).equals(String.valueOf(symbol)) && table.get(i).get(7).equals(String.valueOf(symbol))&& table.get(i).get(9).equals(String.valueOf(symbol))) {
				if(i == 5) {
					table.get(i).set(3, String.valueOf(symbol));
					return;
				}
				else{
					if(table.get(i+1).get(3) != "_"){
						table.get(i).set(3, String.valueOf(symbol));
						return;
					}
				}
			}
			else if (table.get(i).get(3) == "_" && table.get(i).get(1).equals(String.valueOf(symbol)) && table.get(i).get(5).equals(String.valueOf(symbol))&& table.get(i).get(7).equals(String.valueOf(symbol))) {
				if(i == 5) {
					table.get(i).set(3, String.valueOf(symbol));
					return;
				}
				else{
					if(table.get(i+1).get(3) != "_"){
						table.get(i).set(3, String.valueOf(symbol));
						return;
					}
				}
			}
			else if (table.get(i).get(5) == "_" && table.get(i).get(7).equals(String.valueOf(symbol)) && table.get(i).get(9).equals(String.valueOf(symbol))&& table.get(i).get(11).equals(String.valueOf(symbol))) {
				if(i == 5) {
					table.get(i).set(5, String.valueOf(symbol));
					return;
				}
				else{
					if(table.get(i+1).get(5) != "_"){
						table.get(i).set(5, String.valueOf(symbol));
						return;
					}
				}
			}
			else if (table.get(i).get(5) == "_" && table.get(i).get(3).equals(String.valueOf(symbol)) && table.get(i).get(7).equals(String.valueOf(symbol))&& table.get(i).get(9).equals(String.valueOf(symbol))) {
				if(i == 5) {
					table.get(i).set(5, String.valueOf(symbol));
					return;
				}
				else{
					if(table.get(i+1).get(5) != "_"){
						table.get(i).set(5, String.valueOf(symbol));
						return;
					}
				}
			}
			else if (table.get(i).get(5) == "_" && table.get(i).get(1).equals(String.valueOf(symbol)) && table.get(i).get(3).equals(String.valueOf(symbol))&& table.get(i).get(7).equals(String.valueOf(symbol))) {
				if(i == 5) {
					table.get(i).set(5, String.valueOf(symbol));
					return;
				}
				else{
					if(table.get(i+1).get(5) != "_"){
						table.get(i).set(5, String.valueOf(symbol));
						return;
					}
				}
			}
			else if (table.get(i).get(7) == "_" && table.get(i).get(9).equals(String.valueOf(symbol)) && table.get(i).get(11).equals(String.valueOf(symbol))&& table.get(i).get(13).equals(String.valueOf(symbol))) {
				if(i == 5) {
					table.get(i).set(7, String.valueOf(symbol));
					return;
				}
				else{
					if(table.get(i+1).get(7) != "_"){
						table.get(i).set(7, String.valueOf(symbol));
						return;
					}
				}
			}
			else if (table.get(i).get(7) == "_" && table.get(i).get(5).equals(String.valueOf(symbol)) && table.get(i).get(9).equals(String.valueOf(symbol))&& table.get(i).get(11).equals(String.valueOf(symbol))) {
				if(i == 5) {
					table.get(i).set(7, String.valueOf(symbol));
					return;
				}
				else{
					if(table.get(i+1).get(7) != "_"){
						table.get(i).set(7, String.valueOf(symbol));
						return;
					}
				}
			}
			else if (table.get(i).get(7) == "_" && table.get(i).get(3).equals(String.valueOf(symbol)) && table.get(i).get(5).equals(String.valueOf(symbol))&& table.get(i).get(9).equals(String.valueOf(symbol))) {
				if(i == 5) {
					table.get(i).set(7, String.valueOf(symbol));
					return;
				}
				else{
					if(table.get(i+1).get(7) != "_"){
						table.get(i).set(7, String.valueOf(symbol));
						return;
					}
				}
			}
			else if (table.get(i).get(7) == "_" && table.get(i).get(1).equals(String.valueOf(symbol)) && table.get(i).get(3).equals(String.valueOf(symbol))&& table.get(i).get(5).equals(String.valueOf(symbol))) {
				if(i == 5) {
					table.get(i).set(7, String.valueOf(symbol));
					return;
				}
				else{
					if(table.get(i+1).get(7) != "_"){
						table.get(i).set(7, String.valueOf(symbol));
						return;
					}
				}
			}
			else if (table.get(i).get(9) == "_" && table.get(i).get(7).equals(String.valueOf(symbol)) && table.get(i).get(11).equals(String.valueOf(symbol))&& table.get(i).get(13).equals(String.valueOf(symbol))) {
				if(i == 5) {
					table.get(i).set(9, String.valueOf(symbol));
					return;
				}
				else{
					if(table.get(i+1).get(9) != "_"){
						table.get(i).set(9, String.valueOf(symbol));
						return;
					}
				}
			}
			else if (table.get(i).get(9) == "_" && table.get(i).get(5).equals(String.valueOf(symbol)) && table.get(i).get(7).equals(String.valueOf(symbol))&& table.get(i).get(11).equals(String.valueOf(symbol))) {
				if(i == 5) {
					table.get(i).set(9, String.valueOf(symbol));
					return;
				}
				else{
					if(table.get(i+1).get(9) != "_"){
						table.get(i).set(9, String.valueOf(symbol));
						return;
					}
				}
			}
			else if (table.get(i).get(9) == "_" && table.get(i).get(3).equals(String.valueOf(symbol)) && table.get(i).get(5).equals(String.valueOf(symbol))&& table.get(i).get(7).equals(String.valueOf(symbol))) {
				if(i == 5) {
					table.get(i).set(9, String.valueOf(symbol));
					return;
				}
				else{
					if(table.get(i+1).get(9) != "_"){
						table.get(i).set(9, String.valueOf(symbol));
						return;
					}
				}
			}
			else if (table.get(i).get(11) == "_" && table.get(i).get(5).equals(String.valueOf(symbol)) && table.get(i).get(7).equals(String.valueOf(symbol))&& table.get(i).get(9).equals(String.valueOf(symbol))) {
				if(i == 5) {
					table.get(i).set(11, String.valueOf(symbol));
					return;
				}
				else{
					if(table.get(i+1).get(11) != "_"){
						table.get(i).set(11, String.valueOf(symbol));
						return;
					}
				}
			}
			else if (table.get(i).get(11) == "_" && table.get(i).get(7).equals(String.valueOf(symbol)) && table.get(i).get(9).equals(String.valueOf(symbol))&& table.get(i).get(13).equals(String.valueOf(symbol))) {
				if(i == 5) {
					table.get(i).set(11, String.valueOf(symbol));
					return;
				}
				else{
					if(table.get(i+1).get(11) != "_"){
						table.get(i).set(11, String.valueOf(symbol));
						return;
					}
				}
			}
			else if (table.get(i).get(13) == "_" && table.get(i).get(7).equals(String.valueOf(symbol)) && table.get(i).get(9).equals(String.valueOf(symbol))&& table.get(i).get(11).equals(String.valueOf(symbol))) {
				if(i == 5) {
					table.get(i).set(13, String.valueOf(symbol));
					return;
				}
				else{
					if(table.get(i+1).get(13) != "_"){
						table.get(i).set(13, String.valueOf(symbol));
						return;
					}
				}
			}
		}

		for(int i = 0;i < 3;i++){
			for(int o = 1;o < 8;o++){
				if(table.get(i).get(2*o-1) == "_" && table.get(i+1).get(2*o-1).equals(String.valueOf(symbol)) && table.get(i+1).get(2*o-1).equals(table.get(i+2).get(2*o-1))&& table.get(i+1).get(2*o-1).equals(table.get(i+3).get(2*o-1))){
					table.get(i).set(2*o-1,String.valueOf(symbol));
					return;
				}
				else if(table.get(i+1).get(2*o-1) == "_" && table.get(i).get(2*o-1).equals(String.valueOf(symbol)) && table.get(i).get(2*o-1).equals(table.get(i+2).get(2*o-1))&& table.get(i).get(2*o-1).equals(table.get(i+3).get(2*o-1))){
					table.get(i+1).set(2*o-1,String.valueOf(symbol));
					return;
				}
				else if(table.get(i+2).get(2*o-1) == "_" && table.get(i).get(2*o-1).equals(String.valueOf(symbol)) && table.get(i).get(2*o-1).equals(table.get(i+1).get(2*o-1))&& table.get(i).get(2*o-1).equals(table.get(i+3).get(2*o-1))){
					table.get(i).set(2*o-1,String.valueOf(symbol));
					return;
				}
				else if(table.get(i+3).get(2*o-1) == "_" && table.get(i).get(2*o-1).equals(String.valueOf(symbol)) && table.get(i).get(2*o-1).equals(table.get(i+1).get(2*o-1))&& table.get(i).get(2*o-1).equals(table.get(i+2).get(2*o-1))){
					table.get(i).set(2*o-1,String.valueOf(symbol));
					return;
				}
			}
		}

		for(int i = 0; i < 3; i++){
			for(int o = 1;o < 5; o++){
				if(table.get(i).get(2*o-1) == "_" && table.get(i+1).get(2*o+1).equals(String.valueOf(symbol)) && table.get(i+1).get(2*o+1).equals(table.get(i+2).get(2*o+3)) && table.get(i+1).get(2*o+1).equals(table.get(i+3).get(2*o+5))){
					if(table.get(i+1).get(2*o-1) != "_"){
						table.get(i).set(2*o-1,String.valueOf(symbol));
						return;
					}
				}
				else if(table.get(i+1).get(2*o+1) == "_" && table.get(i).get(2*o-1).equals(String.valueOf(symbol)) && table.get(i).get(2*o-1).equals(table.get(i+2).get(2*o+3)) && table.get(i).get(2*o-1).equals(table.get(i+3).get(2*o+5))){
					if(table.get(i+2).get(2*o+1) != "_"){
						table.get(i+1).set(2*o+1,String.valueOf(symbol));
						return;
					}
				}
				else if(table.get(i+2).get(2*o+3) == "_" && table.get(i).get(2*o-1).equals(String.valueOf(symbol)) && table.get(i).get(2*o-1).equals(table.get(i+1).get(2*o+1)) && table.get(i).get(2*o-1).equals(table.get(i+3).get(2*o+5))){
					if(table.get(i+3).get(2*o+3) != "_"){
						table.get(i+2).set(2*o+3,String.valueOf(symbol));
						return;
					}
				}
				else if(table.get(i+3).get(2*o+5) == "_" && table.get(i).get(2*o-1).equals(String.valueOf(symbol)) && table.get(i).get(2*o-1).equals(table.get(i+1).get(2*o+1)) && table.get(i).get(2*o-1).equals(table.get(i+2).get(2*o+3))){
					if(i == 2) {
						table.get(i+3).set(2*o+5,String.valueOf(symbol));
						return;
					}
					else{
						if(table.get(i+4).get(2*o+5) != "_"){
							table.get(i+3).set(2*o+5,String.valueOf(symbol));
							return;
						}
					}
				}
			}
		}

		for(int i = 0; i < 3; i++){
			for(int o = 4;o < 8; o++){
				if(table.get(i).get(2*o-1) == "_" && table.get(i+1).get(2*o-3).equals(String.valueOf(symbol)) && table.get(i+1).get(2*o-3).equals(table.get(i+2).get(2*o-5)) && table.get(i+1).get(2*o-3).equals(table.get(i+3).get(2*o-7))){
					if(table.get(i+1).get(2*o-1) != "_"){
						table.get(i).set(2*o-1,String.valueOf(symbol));
						return;
					}
				}
				else if(table.get(i+1).get(2*o-3) == "_" && table.get(i).get(2*o-1).equals(String.valueOf(symbol)) && table.get(i).get(2*o-1).equals(table.get(i+2).get(2*o-5)) && table.get(i).get(2*o-1).equals(table.get(i+3).get(2*o-7))){
					if(table.get(i+2).get(2*o-3) != "_"){
						table.get(i+1).set(2*o-3,String.valueOf(symbol));
						return;
					}
				}
				else if(table.get(i+2).get(2*o-5) == "_" && table.get(i).get(2*o-1).equals(String.valueOf(symbol)) && table.get(i).get(2*o-1).equals(table.get(i+1).get(2*o-3)) && table.get(i).get(2*o-1).equals(table.get(i+3).get(2*o-7))){
					if(table.get(i+3).get(2*o-5) != "_"){
						table.get(i+2).set(2*o-5,String.valueOf(symbol));
						return;
					}
				}
				else if(table.get(i+3).get(2*o-7) == "_" && table.get(i).get(2*o-1).equals(String.valueOf(symbol)) && table.get(i).get(2*o-1).equals(table.get(i+1).get(2*o-3)) && table.get(i).get(2*o-1).equals(table.get(i+2).get(2*o-5))){
					if(i == 2) {
						table.get(i+3).set(2*o-7,String.valueOf(symbol));
						return;
					}
					else{
						if(table.get(i+4).get(2*o-7) != "_"){
							table.get(i+3).set(2*o-7,String.valueOf(symbol));
							return;
						}
					}
				}
			}
		}

		for(int i = 0;i < 6;i++){
			for(int o = 1;o < 5;o++){
				if(table.get(i).get((2*o-1)) == "_" && table.get(i).get((2*o+1)) != "_" && !table.get(i).get((2*o+1)).equals(String.valueOf(symbol)) && table.get(i).get(2*o+1).equals(table.get(i).get(2*o+3)) && table.get(i).get(2*o+1).equals(table.get(i).get(2*o+5))){
					if(i == 5){
						table.get(i).set(2*o-1,String.valueOf(symbol));
						return;
					}
					else{
						if(table.get(i+1).get((2*o-1)) != "_"){
							table.get(i).set(2*o-1,String.valueOf(symbol));
							return;
						}
					}
				}
				if(table.get(i).get((2*o+1)) == "_" && table.get(i).get((2*o-1)) != "_" && !table.get(i).get((2*o-1)).equals(String.valueOf(symbol)) && table.get(i).get(2*o-1).equals(table.get(i).get(2*o+3)) && table.get(i).get(2*o-1).equals(table.get(i).get(2*o+5))){
					if(i == 5){
						table.get(i).set(2*o+1,String.valueOf(symbol));
						return;
					}
					else{
						if(table.get(i+1).get((2*o+1)) != "_"){
							table.get(i).set(2*o+1,String.valueOf(symbol));
							return;
						}
					}
				}
				if(table.get(i).get((2*o+3)) == "_" && table.get(i).get((2*o-1)) != "_" && !table.get(i).get((2*o-1)).equals(String.valueOf(symbol)) && table.get(i).get(2*o-1).equals(table.get(i).get(2*o+1)) && table.get(i).get(2*o-1).equals(table.get(i).get(2*o+5))){
					if(i == 5){
						table.get(i).set(2*o+3,String.valueOf(symbol));
						return;
					}
					else{
						if(table.get(i+1).get((2*o+3)) != "_"){
							table.get(i).set(2*o+3,String.valueOf(symbol));
							return;
						}
					}
				}
				if(table.get(i).get((2*o+5)) == "_" && table.get(i).get((2*o-1)) != "_" && !table.get(i).get((2*o-1)).equals(String.valueOf(symbol)) && table.get(i).get(2*o-1).equals(table.get(i).get(2*o+1)) && table.get(i).get(2*o-1).equals(table.get(i).get(2*o+3))){
					if(i == 5){
						table.get(i).set(2*o+5,String.valueOf(symbol));
						return;
					}
					else{
						if(table.get(i+1).get((2*o+5)) != "_"){
							table.get(i).set(2*o+5,String.valueOf(symbol));
							return;
						}
					}
				}
			}
		}

		for(int i = 0;i < 3;i++){
			for(int o = 1;o < 8;o++){
				if(table.get(i).get(2*o-1) == "_" && table.get(i+1).get(2*o-1) != "_" && !table.get(i+1).get(2*o-1).equals(String.valueOf(symbol)) && table.get(i+1).get(2*o-1).equals(table.get(i+2).get(2*o-1))&& table.get(i+1).get(2*o-1).equals(table.get(i+3).get(2*o-1))){
					table.get(i).set(2*o-1,String.valueOf(symbol));
					return;
				}
			}
		}

		for(int i = 0; i < 3; i++){
			for(int o = 1;o < 5; o++){
				if(table.get(i).get(2*o-1) == "_" && table.get(i+1).get(2*o+1) != "_" && !table.get(i+1).get(2*o+1).equals(String.valueOf(symbol)) && table.get(i+1).get(2*o+1).equals(table.get(i+2).get(2*o+3)) && table.get(i+1).get(2*o+1).equals(table.get(i+3).get(2*o+5))){
					if(table.get(i+1).get(2*o-1) != "_"){
						table.get(i).set(2*o-1,String.valueOf(symbol));
						return;
					}
				}
				else if(table.get(i+1).get(2*o+1) == "_" && table.get(i).get(2*o-1) != "_"  && !table.get(i).get(2*o-1).equals(String.valueOf(symbol)) && table.get(i).get(2*o-1).equals(table.get(i+2).get(2*o+3)) && table.get(i).get(2*o-1).equals(table.get(i+3).get(2*o+5))){
					if(table.get(i+2).get(2*o+1) != "_"){
						table.get(i+1).set(2*o+1,String.valueOf(symbol));
						return;
					}
				}
				else if(table.get(i+2).get(2*o+3) == "_" && table.get(i).get(2*o-1) != "_" && !table.get(i).get(2*o-1).equals(String.valueOf(symbol)) && table.get(i).get(2*o-1).equals(table.get(i+1).get(2*o+1)) && table.get(i).get(2*o-1).equals(table.get(i+3).get(2*o+5))){
					if(table.get(i+3).get(2*o+3) != "_"){
						table.get(i+2).set(2*o+3,String.valueOf(symbol));
						return;
					}
				}
				else if(table.get(i+3).get(2*o+5) == "_" && table.get(i).get(2*o-1) != "_" && !table.get(i).get(2*o-1).equals(String.valueOf(symbol)) && table.get(i).get(2*o-1).equals(table.get(i+1).get(2*o+1)) && table.get(i).get(2*o-1).equals(table.get(i+2).get(2*o+3))){
					if(i == 2) {
						table.get(i+3).set(2*o+5,String.valueOf(symbol));
						return;
					}
					else{
						if(table.get(i+4).get(2*o+5) != "_"){
							table.get(i+3).set(2*o+5,String.valueOf(symbol));
							return;
						}
					}
				}
			}
		}


		for(int i = 0; i < 3; i++){
			for(int o = 4;o < 8; o++){
				if(table.get(i).get(2*o-1) == "_" && table.get(i+1).get(2*o-3) != "_" && !table.get(i+1).get(2*o-3).equals(String.valueOf(symbol)) && table.get(i+1).get(2*o-3).equals(table.get(i+2).get(2*o-5)) && table.get(i+1).get(2*o-3).equals(table.get(i+3).get(2*o-7))){
					if(table.get(i+1).get(2*o-1) != "_"){
						table.get(i).set(2*o-1,String.valueOf(symbol));
						return;
					}
				}
				else if(table.get(i+1).get(2*o-3) == "_" && table.get(i).get(2*o-1) != "_" && !table.get(i).get(2*o-1).equals(String.valueOf(symbol)) && table.get(i).get(2*o-1).equals(table.get(i+2).get(2*o-5)) && table.get(i).get(2*o-1).equals(table.get(i+3).get(2*o-7))){
					if(table.get(i+2).get(2*o-3) != "_"){
						table.get(i+1).set(2*o-3,String.valueOf(symbol));
						return;
					}
				}
				else if(table.get(i+2).get(2*o-5) == "_" && table.get(i).get(2*o-1) != "_" && !table.get(i).get(2*o-1).equals(String.valueOf(symbol)) && table.get(i).get(2*o-1).equals(table.get(i+1).get(2*o-3)) && table.get(i).get(2*o-1).equals(table.get(i+3).get(2*o-7))){
					if(table.get(i+3).get(2*o-5) != "_"){
						table.get(i+2).set(2*o-5,String.valueOf(symbol));
						return;
					}
				}
				else if(table.get(i+3).get(2*o-7) == "_" && table.get(i).get(2*o-1) != "_" && !table.get(i).get(2*o-1).equals(String.valueOf(symbol)) && table.get(i).get(2*o-1).equals(table.get(i+1).get(2*o-3)) && table.get(i).get(2*o-1).equals(table.get(i+2).get(2*o-5))){
					if(i == 2) {
						table.get(i+3).set(2*o-7,String.valueOf(symbol));
						return;
					}
					else{
						if(table.get(i+4).get(2*o-7) != "_"){
							table.get(i+3).set(2*o-7,String.valueOf(symbol));
							return;
						}
					}
				}
			}
		}


		Random random = new Random();
		int y = 0;
		while (true){
			y = random.nextInt(8);
			if(y !=0){
				break;
			}
		}
		int z = y;
		int x = 0;
		while(table.get(0).get(2*y-1) != "_"){
			y = random.nextInt(8);
			if(y == 0){
				y = z;
			}
		}
		for(int i = 5; i > -1;i--){
			if(board.table.get(i).get(y + y - 1) == "_"){
				board.table.get(i).set(y + y - 1, String.valueOf(symbol));
				i = 0;
			}
			else{
				continue;
			}
		}

	}
}
