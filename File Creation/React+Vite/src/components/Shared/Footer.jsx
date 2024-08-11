import { Facebook, Twitter } from 'lucide-react'
import React from 'react'
import { Link } from 'react-router-dom'

const Footer = () => {
  return (
    <div className=" w-full h-[8vh] flex flex-row justify-center items-center border-t-2 border-primary/50">
      <div className="w-1/4 h-full text-primary font-bold flex justify-start items-center text-lg"> © iamneo.ai 2024</div>
      <div className='w-2/4 h-full font-bold flex flex-row justify-end items-center gap-8 '>
        <a href='#' target='_blank' className='h-8 w-8 rounded-md text-primary hover:bg-primary/50 hover:text-background flex justify-center items-center'>
          <Facebook className='h-6 w-6' />
        </a>
        <a href='#' target='_blank' className='h-8 w-8 rounded-md text-primary hover:bg-primary/50 hover:text-background flex justify-center items-center'>
          <Twitter className='h-6 w-6' />
        </a>
      </div>
    </div>
  )
}

export default Footer