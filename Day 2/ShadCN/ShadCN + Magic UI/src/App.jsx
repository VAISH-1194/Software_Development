import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { Button } from './components/ui/button'
import { ModeToggle } from './components/mode-toggle'
import Globe from './components/magicui/globe'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <ModeToggle />
      <Button>Click me</Button>
      <div className="absolute bottom-0 left-0 flex h-1/2 w-[99vw] items-center justify-center overflow-hidden  px-40 pb-40 pt-8 md:pb-60 ">
        <span className="pointer-events-none whitespace-pre-wrap bg-gradient-to-b from-black to-gray-300/80 bg-clip-text text-center text-8xl font-semibold leading-none text-transparent dark:from-white dark:to-slate-900/10">
          Globe
        </span>
        <Globe className="top-28" />
        <div className="pointer-events-none absolute inset-0 h-full" />
      </div>
    </>
  )
}

export default App
