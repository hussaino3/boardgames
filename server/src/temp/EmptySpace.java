package com.boarge.server.temp;

public class EmptySpace extends Piece
{
	EmptySpace()
	{

	}

	@Override
	public int getTeam1Image()
	{
		return 0;
	}

	@Override
	public int getTeam2Image()
	{
		return 0;
	}

	@Override
	public int getHighlightImage()
	{
		return -1;// R.drawable.empty_space_highlight;
	}

	EmptySpace(int team, String name)
	{
		super(team, name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
